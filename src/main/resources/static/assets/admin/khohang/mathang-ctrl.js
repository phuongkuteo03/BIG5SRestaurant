app.controller("mathang-ctrl", function ($scope, $http) {
    $scope.items = [];
    $scope.form = {};

    $scope.initialize = function () {
        //load mathang
        $http.get("/rest/mathang").then(resp => {
            $scope.items = resp.data;
        });
        //load donvitinh
        $http.get("/rest/donvitinh").then(resp => {
            $scope.donvitinh = resp.data;
        });
        //load danhmuc
        $http.get("/rest/danhmuc").then(resp => {
            $scope.danhmuc = resp.data;
        });
        //load nhacungcap
        $http.get("/rest/nhacungcap").then(resp => {
            $scope.nhacungcap = resp.data;
        });
    }
    //Khoi dau
    $scope.initialize();

    //Xoa form
    $scope.reset = function () {
        $scope.form = {};
    }
    //Hien thi len form
    $scope.edit = function (item) {
        $scope.form = angular.copy(item);
        $(".nav-tabs a:eq(1)").tab('show')
    }
    //Them san pham moi
     $scope.create = function () {
         var item = angular.copy($scope.form);
         $http.post(`/rest/mathang`, item).then(resp => {
			 $scope.items.push(resp.data);
             $scope.reset();
             alert("Thêm mới thành công!");
         }).catch(error => {
             alert("Lỗi thêm mới!");
             console.log("Error", error);
         });
     }
    //Cap nhat san pham
     $scope.update = function () {
         var item = angular.copy($scope.form);
         $http.put(`/rest/mathang/${item.id}`, item).then(resp => {
             var index = $scope.items.findIndex(p => p.id == item.id);
             $scope.items[index] = item;
             alert("Cập nhật thành công!");
         }).catch(error => {
             alert("Lỗi cập nhật!");
             console.log("Error", error);
         });
     }
    // //Xoa san pham
    // $scope.delete = function (item) {
    //     $http.delete(`/rest/products/${item.id}`).then(resp => {
    //         var index = $scope.items.findIndex(p => p.id == item.id);
    //         $scope.items.splice(index, 1);
    //         $scope.reset();
    //         alert("Xóa sản phẩm thành công!");
    //     }).catch(error => {
    //         alert("Lỗi xóa sản phẩm!");
    //         console.log("Error", error);
    //     });
    // }
    // //Upload hinh
    // $scope.imageChanged = function (file) {
    //     var data = new FormData();
    //     data.append('file', file[0]);
    //     $http.post('/rest/upload/images', data, {
    //         transformRequest: angular.identity,
    //         headers: { 'Content-Type': undefined }
    //     }).then(resp => {
    //         $scope.form.image = resp.data.name;
    //     }).catch(error => {
    //         alert("Lỗi upload hình ảnh");
    //         console.log("Error", error);
    //     })
    // }

    $scope.pager = {
         page: 0,
         size: 10,
         get items() {
             var start = this.page * this.size;
             return $scope.items.slice(start, start + this.size);
        },
       get count() {
             return Math.ceil(1.0 * $scope.items.length / this.size);
         },
        first() {
             this.page = 0;
         },
         prev() {
           this.page--;
            if (this.page < 0) {
               this.last();
            }
         },
        next() {
             this.page++;
            if (this.page >= this.count) {
                this.first();
            }
         },
       last() {
            this.page = this.count - 1;
        }
     }
});