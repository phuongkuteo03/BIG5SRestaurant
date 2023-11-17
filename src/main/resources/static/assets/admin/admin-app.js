app = angular.module("admin-app", ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/khachhang", {
            templateUrl: "/assets/admin/khachhang/index.html",
            controller: "khachhang-ctrl"
        })
        .when("/nhanvien", {
            templateUrl: "/assets/admin/nhanvien/index.html",
            controller: "nhanvien-ctrl"
        })
        .when("/menu", {
            templateUrl: "/assets/admin/menu/index.html",
            controller: "menu-ctrl"
        })
        .when("/hangmuc", {
            templateUrl: "/assets/admin/hangmuc/index.html",
            controller: "hangmuc-ctrl"
        })
        .when("/calamviec", {
            templateUrl: "/assets/admin/calamviec/index.html",
            controller: "calamviec-ctrl"
        })
        .when("/donhang", {
            templateUrl: "/assets/admin/donhang/index.html",
            controller: "donhangonline-ctrl"
        })
        .when("/mathang", {
            templateUrl: "/assets/admin/khohang/index.html",
            controller: "mathang-ctrl"
        })
        .when("/danhmuc", {
            templateUrl: "/assets/admin/danhmuc/index.html",
            controller: "danhmuc-ctrl"
        })
        .when("/nhacungcap", {
            templateUrl: "/assets/admin/nhacungcap/index.html",
            controller: "nhacungcap-ctrl"
        })
        .when("/phieubep", {
            templateUrl: "/assets/admin/phieubep/index.html",
            controller: "phieubep-ctrl"
        })
        .when("/kiemkho", {
            templateUrl: "/assets/admin/kiemkho/index.html",
            controller: "kiemkho-ctrl"
        })
        .when("/nhaphang", {
            templateUrl: "/assets/admin/nhaphang/index.html",
            controller: "nhaphang-ctrl"
        })
        .when("/orders", {
            templateUrl: "/assets/admin/orders/index.html",
            controller: "orders-ctrl"
        })
        .otherwise({
			templateUrl: "/assets/admin/dashboard.html"
            // template: "<main class='pt-4'><img src='/assets/images/apple-icon.png' alt='Logo' width='auto' height='163' class='rounded mx-auto d-block'> <h1 class='text-center text-success fw-bold pb-5'><b>A</b>dministration</h1></div>"
        });
})