const app = angular.module("security-app", []);

app.controller("security-ctrl", function($scope, $http) {
	$scope.taikhoan = {
		taikhoan: [],
		dangky() {
			var account = {
				username: $("#username").val(),
				email: $("#email").val(),
				password: $("#password").val(),
				hoTen: $("#hoTen").val(),
				vaitro: { maVT: "khach" },
				trangThai: true
			};

			var re_pass = $("#re_pass").val();
			if (!account.username) { //Username không được để trống
				Swal.fire({
					title: "Username không được để trống!",
					text: "Yêu cầu nhập lại",
					icon: "warning"
				});
			} else if (!account.email) { //Email không được để trống
				Swal.fire({
					title: "Email không được để trống!",
					text: "Yêu cầu nhập lại",
					icon: "warning"
				});
			} else if (!account.password) { //Password không được để trống
				Swal.fire({
					title: "Password không được để trống!",
					text: "Yêu cầu nhập lại",
					icon: "warning"
				});
			} else if (!account.hoTen) { //Họ tên không được để trống
				Swal.fire({
					title: "Họ và tên không được để trống!",
					text: "Yêu cầu nhập lại",
					icon: "warning"
				});
			} else if (!re_pass) { //Nhập lại mật khẩu không được để trống
				Swal.fire({
					title: "Nhập lại mật khẩu không được để trống!",
					text: "Yêu cầu nhập lại",
					icon: "warning"
				});
			} else {
				// Kiểm tra xem tài khoản đã tồn tại hay chưa
				$http.get("/rest/taikhoan").then(resp => {
					datas = resp.data;
					for (let i = 0; i < datas.length; i++) {
						this.taikhoan.push(datas[i]);
						if (datas[i].username == account.username) {
							Swal.fire({
								title: "Tài khoản đã tồn tại!",
								text: "Yêu cầu nhập lại",
								icon: "warning"
							});
						}
					}
				})

				//kiểm lỗi
				re_password = $("#re_pass").val();
				if (account.password != re_password) { // kiểm tra mật khẩu và nhập lại mật khẩu
					Swal.fire({
						title: "Mật khẩu không trùng nhau!",
						text: "Yêu cầu nhập lại",
						icon: "warning"
					});
				} else {
					//thực hiện đăng ký
					$http.post("/rest/taikhoan", account).then(resp => {
						Swal.fire({
							icon: 'success',
							title: 'Đăng ký thành công!',
							text: 'Quay lại đăng nhập!',
							showConfirmButton: false,
							closeOnClickOutside: false,
							allowOutsideClick: false,
							timer: 1600
						});
					}).catch(error => {
						Swal.fire({
							title: "Đăng ký thất bại!",
							text: "Yêu cầu nhập lại",
							icon: "error"
						});
						console.log("error", error);
					})
				}
			}
		}
	}
})