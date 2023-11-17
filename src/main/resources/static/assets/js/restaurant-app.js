const app = angular.module("restaurant-app", []);

app.controller("restaurant-ctrl", function($scope, $http) {

	$scope.initialize = function() {
		//load ban
		$http.get("/rest/ban").then(resp => {
			$scope.ban = resp.data;
		});
	}

	//Khoi dau
	$scope.initialize();

	// quan ly gio hang online
	$scope.cart = {
		items: [],
		// them mon an vao gio hang
		add(id) {
			var item = this.items.find(item => item.id == id);
			if (item) {
				item.soLuong++;
				this.saveToLocalStorage();
			} else {
				$http.get(`/rest/menu/${id}`).then(resp => {
					resp.data.soLuong = 1;
					this.items.push(resp.data);
					this.saveToLocalStorage();
				})
			}
		},
		//xoa mon an khoi gio hang
		remove(id) {
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index, 1);
			this.saveToLocalStorage();
		},
		//xoa sach cac mon an
		clear() {
			this.items = []
			this.saveToLocalStorage();
		},
		//tinh thanh tien cua 1 mon an
		amt_of(item) { },
		//tinh tong so luong mon an co trong gio
		get count() {
			return this.items
				.map(item => item.soLuong)
				.reduce((total, soLuong) => total += soLuong, 0);
		},
		//tong thanh tien cac mon an
		get amount() {
			return this.items
				.map(item => item.soLuong * item.giaTien)
				.reduce((total, soLuong) => total += soLuong, 0);
		},
		//luu gio hang vao local storage
		saveToLocalStorage() {
			var json = JSON.stringify(angular.copy(this.items));
			localStorage.setItem("cart", json);
		},
		//doc gio hang tu local storage
		loadFromLocalStorage() {
			var json = localStorage.getItem("cart");
			this.items = json ? JSON.parse(json) : [];
		}
	}
	$scope.cart.loadFromLocalStorage();

	//quan ly dat hang
	$scope.dathang = {
		ngayTao: new Date(),
		sdt: "",
		diaChi: "",
		ghiChu: "",
		trangThai: false,
		taikhoan: { username: $("#username").text() },
		get chiTietDonHangOnline() {
			return $scope.cart.items.map(item => {
				return {
					menumonan: { id: item.id },
					giaTien: item.giaTien,
					soLuong: item.soLuong
				}
			});
		},
		purchaser() {
			var order = angular.copy(this);
			//thuc hien dat hang
			$http.post("/rest/donhangonline", order).then(resp => {
				alert("Đặt hàng thành công!");
				$scope.cart.clear();
				location.href = "/donhang/detail/" + resp.data.id;
			}).catch(error => {
				alert("Đặt hàng lỗi!");
				console.log(error)
			})
		}
	}

	// quan ly hoa don
	$scope.order = {
		items: [],
		id: parseInt($("#ban").text()),
		getOrderByTable() {
			var id = parseInt($("#ban").text());
			if (id) {
				$http.get(`/rest/order/${id}`).then(resp => {
					this.clear();
					datas = resp.data;
					for (let i = 0; i < datas.length; i++) {
						this.items.push(datas[i]);
					}
					this.saveToLocalStorage();
				})
			}
		},
		// them mon an vao hoa don
		add(id) {
			var item = this.items.find(item => item.menumonan.id == id);
			var hoadon = {
				id: parseInt($("#id").text()),
				ngayTao: new Date(),
				ghiChu: $("#ghichu").text(),
				trangThai: false,
				taikhoan: { username: $("#username").text() },
				ban: { id: parseInt($("#ban").text()) },
			}
			if (item) {
				item.soLuong++;
				this.saveToLocalStorage();
			} else {
				$http.get(`/rest/menu/${id}`).then(resp => {
					var chiTietOrder = {
						ghiChu: "",
						soLuong: 1,
						giaTien: resp.data.giaTien,
						menumonan: resp.data,
						orders: hoadon
					}
					this.items.push(chiTietOrder);
					this.saveToLocalStorage();
				})
			}
		},
		//xoa mon an khoi hoa don
		remove(id) {
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index, 1);
			this.saveToLocalStorage();
		},
		//xoa sach cac mon an
		clear() {
			this.items = []
			this.saveToLocalStorage();
		},
		//tinh thanh tien cua 1 mon an
		amt_of(item) { },
		//tinh tong so luong mon an co trong hoa don
		get count() {
			return this.items
				.map(item => item.soLuong)
				.reduce((total, soLuong) => total += soLuong, 0);
		},
		//tong thanh tien cac mon an
		get amount() {
			return this.items
				.map(item => item.soLuong * item.giaTien)
				.reduce((total, soLuong) => total += soLuong, 0);
		},
		//luu hoa don vao local storage
		saveToLocalStorage() {
			var json = JSON.stringify(angular.copy(this.items));
			localStorage.setItem("order", json);
		},
		//doc hoa don tu local storage
		loadFromLocalStorage() {
			var json = localStorage.getItem("order");
			this.items = json ? JSON.parse(json) : [];
		}
	}
	$scope.order.getOrderByTable();
	$scope.order.loadFromLocalStorage();

	//quan ly tao hoa don
	$scope.hoadon = {
		ngayTao: new Date(),
		ghiChu: "",
		trangThai: false,
		taikhoan: { username: $("#username").text() },

		get chiTietOrder() {
			return $scope.order.items.map(item => {
				return {
					menumonan: { id: item.menumonan.id },
					giaTien: item.giaTien,
					soLuong: item.soLuong,
					ghiChu: item.menumonan.ghiChu
				}
			});
		},

		get chiTietPhieuBep() {
			return $scope.order.items.map(item => {
				return {
					menumonan: { id: item.menumonan.id },
					giaTien: item.giaTien,
					soLuong: item.soLuong,
					ghiChu: item.menumonan.ghiChu
				}
			});
		},

		// cap nhat order cua ban
		update() {
			var hoadon = {
				id: parseInt($("#id").text()),
				ngayTao: new Date(),
				ghiChu: $("#ghichu").text(),
				trangThai: false,
				taikhoan: { username: $("#username").text() },
				ban: { id: parseInt($("#ban").text()) },
			}
			// thuc hien chinh ban
			$http.put(`/rest/chitietorder/${hoadon.id}`, $scope.order.items).then(resp => {
				alert("Thay đổi thành công!");
				location.href = `/table/detail/${hoadon.ban.id}`
			}).catch(error => {
				alert("Lỗi thay đổi!");
				console.log("Error", error);
			});
		},

		purchaser() {
			var order = angular.copy(this);
			var phieubep = angular.copy(this);
			var ban = {
				id: $scope.hoadon.ban.id,
				thoiGianNgoi: new Date(),
				trangThai: true
			}
			// thuc hien chinh ban
			$http.put(`/rest/ban/${ban.id}`, ban).then(resp => {
			}).catch(error => {
				alert("Lỗi thay đổi bàn!");
				console.log("Error", error);
			});
			//thuc hien tao phieu bep
			$http.post("/rest/phieubep", phieubep).then(resp => {
			}).catch(error => {
				alert("Tạo phiếu bếp lỗi!");
				console.log(error)
			})
			//thuc hien tao hoa don
			$http.post("/rest/order", order).then(resp => {
				alert("Tạo hóa đơn thành công!");
				$scope.order.clear();
				$scope.initialize();
				location.href = "/table"
			}).catch(error => {
				alert("Tạo hóa đơn lỗi!");
				console.log(error)
			})
		},

		thanhtoan() {
			var ban = {
				id: parseInt($("#ban").text()),
				thoiGianNgoi: new Date(),
				trangThai: false
			}
			var hoadon = {
				id: parseInt($("#id").text()),
				ngayTao: new Date(),
				ghiChu: $("#ghichu").text(),
				trangThai: true,
				taikhoan: { username: $("#username").text() },
				ban: { id: parseInt($("#ban").text()) },
			}
			$http.put(`/rest/ban/${ban.id}`, ban).then(resp => {
			}).catch(error => {
				alert("Lỗi thay đổi bàn!");
				console.log("Error", error);
			});
			$http.put(`/rest/order/${hoadon.id}`, hoadon).then(resp => {
				alert("Thanh toán thành công!");
				$scope.order.clear();
				location.href = "/table"
			}).catch(error => {
				alert("Lỗi thay đổi order!");
				console.log("Error", error);
			});
		}
	}
})