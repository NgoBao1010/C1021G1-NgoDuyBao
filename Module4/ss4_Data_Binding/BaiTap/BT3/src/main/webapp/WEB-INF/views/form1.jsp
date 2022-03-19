<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/2/2022
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="vi"><head>

    <title>Hệ thống thông tin quản lý Khai báo Y tế</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">


    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">

    <meta name="description" content="Hệ thống thông tin quản lý khai báo y tế">
    <meta name="keywords" content="tờ khai y tế, khai báo y tế, health declaration, khai y tế">
    <meta name="Author" content="Hệ thống thông tin quản lý Khai báo Y tế">
    <meta name="copyright" content="Hệ thống thông tin quản lý Khai báo Y tế">



    <meta property="fb:app_id" content="1166212453898229">





    <meta property="og:image" content="https://tokhaiyte.vn/upload/2001432/20200228/qlnl_linewhite_18291_265ba6a3f1.png">
    <link rel="image_src" href="https://tokhaiyte.vn/upload/2001432/20200228/qlnl_linewhite_18291_265ba6a3f1.png">

    <meta property="og:type" content="blog">
    <meta property="og:site_name" content="tokhaiyte.vn">
    <meta property="og:title" content="Hệ thống thông tin quản lý Khai báo Y tế">
    <meta property="og:description" content="">

    <meta property="og:url" content="https://tokhaiyte.vn">
    <link rel="canonical" href="https://tokhaiyte.vn/">


    <link href="/upload/2001432/20210123/logoboyte_ad235.png" rel="shortcut icon" type="image/x-icon">

    <link rel="preload" href="/css/1.521669/2001432/3135/style.css?669" as="style">
    <link rel="preload" href="/3rdparty/font-awesome-5.13.1/css/all.min.css" as="style">
    <link type="text/css" rel="stylesheet" href="/css/1.521669/2001432/3135/style.css?669">


    <link rel="preload" as="script" href="/publish/js/lib2-1.521.min.js?669">
    <link rel="preload" href="/3rdparty/font-awesome-5.13.1/webfonts/fa-solid-900.woff2" as="font" type="font/woff2" crossorigin="">
    <link rel="preload" href="/3rdparty/font-awesome-5.13.1/webfonts/fa-brands-400.woff2" as="font" type="font/woff2" crossorigin="">
    <link rel="preload" href="/3rdparty/font-awesome-5.13.1/webfonts/fa-regular-400.woff2" as="font" type="font/woff2" crossorigin="">
    <link rel="stylesheet" type="text/css" href="/3rdparty/font-awesome-5.13.1/css/all.min.css">


    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script><script async="" src="https://www.googletagmanager.com/gtag/js?id=UA-157903599-2"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'UA-157903599-2');
    </script>




    <link rel="stylesheet" type="text/css" href="https://tokhaiyte.vn/3rdparty/jQuery/select2-4.0.3/dist/css/select2.min.css?669"><link rel="stylesheet" type="text/css" href="https://tokhaiyte.vn/3rdparty/jQuery/jqueryui/themes/smoothness/jquery-ui.css?669"></head><body style="padding:0px;margin:0px;">


<div class="region-top"><div id="module4" class="ModuleWrapper"><div class="table-banner-home"><div id="column1-4" class="column1 container ">
    <div class="foverlay"></div>  <div class="columns-widget row">  <div class="col-md-12 col-xs-12 col-sm-12"><div id="module5" class="ModuleWrapper"><div id="module5" class="ModuleWrapper">
    <div class="banner-home">
        <div class="banner-top">
            <div class="text-right relative button-question">
                <a class="navbar-btn" href="/huong-dan"><i class="fa fa-question-circle fa-1_5x" aria-hidden="true"></i></a>
            </div>
            <div class="relative text-center text-uppercase">
                <div class="col-left">
                    <div class="mr-10">
                        <a href="/">
                            <img src="/upload/2001432/Image/logoboyte.png" width="80" alt="BoYte">
                        </a>
                    </div>
                    <div class="heading-title">
                        <div class="text-bold mb-5">Ban chỉ đạo quốc gia</div>
                        <div class="text-bold">Phòng chống dịch bệnh Covid-19</div>
                        <div class="text-bold">Hệ thống quản lý khai báo y tế</div>
                    </div>
                </div>
                <div class="col-right">
                    <img src="/upload/2001432/Image/logo-groups.png" alt="Logo">
                </div>
            </div>
        </div>
    </div>
</div>
    <style>
        .relative{
            position: relative;
        }
        .stickyHeader.home-page{
            display: none !important;
        }
        #module5 .banner-top{
            background: url(/upload/2001432/Image/trongdong.png) center -164px no-repeat;
            position: relative;
            color: #fff;
            background-size: 800px;
            padding: 15px;
            margin-bottom: 15px;
            border-radius: 0 0 10px 10px;
        }
        #module5 .banner-top a{
            color: #fff;
        }
        #module5 .fa-1_5x{
            font-size: 150%;
        }
        #module5 .banner-top:before{
            content: "";
            background-color: #2d3091;
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            display: block;
            opacity: 0.9;
            z-index: -1;
        }
        #module5 .list{
            display: grid;
            grid-gap: 10px;
            grid-template-columns: 1fr 1fr;
        }
        #module5 .list li{
            padding: 2px;
            border: 1px solid #0372c7;
            border-radius: 5px;
        }
        #module5 .list a{
            background-color: #0372c7;
            color: #fff;
            border-radius: 5px;
            display: block;
            height: 100%;
            text-align: center;
            font-size: 18px;
        }
        .topBanner .btn-wrapper{
            display: table;
            width: 100%;
            margin-bottom: 10px;
        }
        .topBanner .btn-wrapper .btn-inner{
            display: table-cell;
            width: 50%;
            padding: 0 5px;
        }
        .topBanner .btn-wrapper .btn-larger{
            border-radius: 5px;
            padding-right: 8px;
            padding-left: 8px;
            display: block;
        }
        .topBanner .btn-wrapper .text-vi,.topBanner .btn-wrapper .text-en{
            display: block;
        }
        .topBanner .btn-domestic{
            background-color: #343c93;
            border-color: #2e6da4;
        }
        .topBanner .btn-entry{
            background-color: #0166bf;
            border-color: #478cd1;
        }
        @media(max-width: 480px){
            #module5 .list {
                grid-template-columns: 1fr;
            }
        }
        @media screen and (min-width: 375px){
            .topBanner .btn-wrapper .btn-larger{
                min-width: 170px;
            }
            .topBanner .btn-wrapper .btn-inner{
                margin-left: 6px;
                margin-right: 6px;
            }
            .topBanner .btn-wrapper .btn-inner:first-child{
                padding-left: 10px;
            }
            .topBanner .btn-wrapper .btn-inner:last-child{
                padding-right: 10px;
            }
        }
        @media screen and (min-width: 544px){
            .topBanner .btn-wrapper .btn-larger{
                font-size: 17px;
            }
        }
        .table-banner-home {
            background: none;
        }
        @media (min-width: 769px) {
            .table-banner-home {
                background: #0a6dd4;
            }
            #module5 .banner-home .button-question {
                position: absolute;
                top: 10px;
                right: 10px;
            }
            #module5 .banner-home .relative.text-center.text-uppercase {
                display: flex;
            }
            #module5 .banner-home .col-left {
                flex-basis: 50%;
                display: flex;
                align-items: center;
            }
            #module5 .banner-home .col-left .heading-title {
                text-align: left;
            }
            #module5 .banner-home .col-right {
                flex-basis: 50%;
                text-align: right;
            }
            #module5 .banner-top{
                background: url(upload/2001432/20210301/banner_vi_01945.png) no-repeat;
                position: relative;
                color: #fff;
                background-size: contain;
                padding: 5px;
                margin-bottom: 15px;
                border-radius: 0 0 10px 10px;
            }
        }
    </style>
    <div class="report-sticky"><a class="btn-report-vhd" href="javascript:void(0);" data-x-modal="Project.TKYT.HDNotify.sendRequest" data-title="Thông báo nguy cơ COVID-19"><i class="fas fa-bullhorn"></i><span>Thông báo nguy cơ</span></a></div>
    <style>
        .report-sticky{
            position: fixed;
            right: 0;
            top: 40%;
            transform: translateX(-50%);
            width:1px;
            z-index: 1000;
        }
        .report-sticky .btn-report-vhd{
            text-decoration: none;
            display: block;
            min-width: 180px;
            margin: 0px;
            text-align: right;
            line-height: 34px;
            -webkit-transform: rotate(90deg);
            -ms-transform: rotate(90deg);
            transform: rotate(90deg);
            -webkit-transform-origin: 0;
            -ms-transform-origin: 0;
            transform-origin: 0 0;
            background: #ea2511;
            color: #fff;
            text-align: center;
            border-radius: 0 0 5px 5px;
        }
        .report-sticky .btn-report-vhd span {
            padding-left: 10px;
        }
        .table-banner-home>.container{
            padding: 0;
        }
        .table-banner-home>.container>.row{
            margin: 0;
        }
        .table-banner-home>.container>.row>div{
            padding: 0;
        }
        .banner-top{
            margin-bottom: 0 !important;
        }
        .table-bg-footer{
            position:fixed;
            left:0;
            right:0;
            bottom:0;
        }
        @media(min-width:992px){
            .table-new-home{
                padding-top:10%;
            }
        }
    </style>
</div>
</div></div>  </div></div></div><style>/**/
</style>
</div><div id="whole-page">    <div id="page-header"></div> <div id="page-content"><div id="module6" class="ModuleWrapper"><div class="home-space"><div id="column1-6" class="column1 container ">
    <div class="foverlay"></div>  <div class="columns-widget row">  <div class="col-md-12 col-xs-12 col-sm-12"><div id="module7" class="ModuleWrapper"><div class="widget-space" style="height:10px"></div>
</div><div id="module8" class="ModuleWrapper">
    <div class="register-translation">
        <div class="register-translation-top">
            <div class="title-translation">Đăng ký điểm kiểm dịch!</div>
            <div class="regis-translation">
                <a class="btn-regis" href="https://qr.tokhaiyte.vn/dkdd" title="Đăng ký">Đăng ký</a>
            </div>
        </div>
        <div class="text-left"><a class="text-left" style="color: #0a0a0b;font-size: 20px;
font-weight: bold;text-decoration: underline;" href="https://tokhaiyte.vn/?page=Project.TKYT.destinationRegister" title="Đăng ký điểm kiểm soát cách ly">Đăng ký điểm kiểm soát cách ly</a></div>
        <div class="btn-login-logout text-right">

            <a href="javascript:VHV.Model('Member.User.logout')(false, function(){
location = 'https://tokhaiyte.vn/';
});void(0);" class="btn btn-logout" title="Đăng xuất" rel="nofollow">
                <i class="fas fa-sign-out-alt"></i>
                <span class="ml-5">Đăng xuất</span>
            </a>

        </div>
    </div>
    <style>
        .register-translation {
            margin-bottom: 20px;
        }
        .register-translation-top {
            margin-bottom: 10px;
            background-color: #33C6F8;
            border-radius: 7px;
            padding:20px;
            position: relative;
            color:#fff;
        }
        .register-translation a{
            color:#fff;
        }
        .register-translation a:hover{
            text-decoration: none !important;
        }
        .register-translation a.btn-regis:hover{
            background-color: #1c4b92;
        }
        .btn-login-logout {
            margin-bottom: 20px;
        }
        .btn-login-logout a{
            color: #FFFFFF;
            border-radius: 20px;
            font-size: 18px;
            line-height: 18px;
            font-weight: bold;
        }
        .btn-login-logout a.btn-logout {
            background: red;
        }
        .btn-login-logout a.btn-logout:hover{
            background: #ce0000;
            color: #FFFFFF;
        }
        .btn-login-logout a.btn-signin {
            background: #0A6DD4;
        }
        .btn-login-logout a.btn-signin:hover{
            background: #0957a9;
            color: #FFFFFF;
        }
        .register-translation a:hover{
            text-decoration: underline;
        }
        .register-translation .title-translation{
            text-transform: uppercase;
            font-weight: 700;
            font-size: 20px;
            margin-bottom: 10px;
            line-height: 24px;
        }
        .register-translation .link-translation{
            font-size: 16px;
        }
        .register-translation .regis-translation{
            position: absolute;
            top: 25px;
            right:20px;
        }
        .register-translation .regis-translation a{
            display: inline-block;
            padding:0 20px;
            line-height: 36px;
            border-radius: 40px;
            background-color: #266BD1;
            font-size: 18px;
            font-weight: 700;
            text-transform: uppercase;
        }
        @media(max-width: 544px){
            .register-translation .regis-translation{
                position: relative;
                top: unset;
                right: unset;
                margin-top: 10px;
            }
            .register-translation{
                padding:10px;
            }
            .register-translation .title-translation{
                font-size: 18px;
            }
            .register-translation .link-translation{
                font-size: 15px;
            }
        }
    </style>
</div><div id="module9" class="ModuleWrapper"><div id="wrapper9" class="passenger-wrapper">   <h1 class="text-center mtb-20">Tờ khai y tế/Vietnam Health Declaration</h1>   <ul class="nav nav-tabs"> <li class=""><a data-toggle="tab" href="#tab-9-3" data-case="HDLocal" aria-expanded="false">Khai di chuyển nội địa<br>For domestic move declaration</a></li>
    <li class=""><a data-toggle="tab" href="#tab-9-1" data-case="HDPassenger">Cho người nhập cảnh<br>Entry declaration</a></li>
    <li class="active"><a data-toggle="tab" href="#tab-9-2" data-case="HDHealth" aria-expanded="true">Khai báo toàn dân<br>For domestic guests</a></li>
</ul> <div class="tab-content" style="background: white;padding: 10px;border-left: 1px solid #ddd;border-right: 1px solid #ddd;border-bottom: 1px solid #ddd;"> <div id="tab-module-content-9" class="tab-pane fade in active"> <div id="loadModuleContent9"><div id="module2009" class="ModuleWrapper"><div class="artile-edit-layout">
    <form id="form2009" method="post" enctype="multipart/form-data" novalidate="novalidate">
        <input type="hidden" name="groupId" value="5e50878976801b710216b807"> <input type="hidden" name="type" value=""> <div class="box box-edit-layout"> <div class="box-body no-padding">
        <br> <div class="formWrapper formWrapper-mobile mt-20"> <div class="lang-lbl lang-lbl-desktop text-bold mb-15 pr-20">Chọn ngôn ngữ để khai báo y tế&nbsp;/Select the language to declare health:</div> <div class="list-lang"> <div class="sendType-option inline-block"> <label style="font-weight:100;width:auto;display:inline-block;"><input class="style-radio" type="radio" name="fields[lang]" value="vi" checked="">
        <img alt="" src="/App/images/Language/vi.jpg" width="70" height="50"></label> <label style="font-weight:100;width:auto;display:inline-block;"> <input class="style-radio" type="radio" name="fields[lang]" value="en">
        <img alt="" src="/App/images/Language/en.jpg" width="70" height="50"></label> </div> </div>  <div class="box-btn-tutorial" style="position: absolute;top: 0;right: 0;"> <a class="inline-block mr-5 btn btn-primary mb-5" style="color: #fff;" href="javascript:void(0)" title="Cập nhật tờ khai" data-x-modal="Project.TKYT.Group.HealthRecord.HealthMonitoring.update" data-submit-service="Project.TKYT.Home.Health.checkUpdateInfo" data-lang="vi"><i class="fa fa-edit" aria-hidden="true"></i> <span class="hidden-xs">Cập nhật tờ khai</span></a> </div> </div> <input type="hidden" name="fields[idCheck]"> <input type="hidden" name="fields[idLogic]"> <input type="hidden" name="fields[idType]"> <input type="hidden" name="fields[idconf]"> <input type="hidden" name="fields[file]"> <div id="camera2009" class="col-md-12" style="margin:5px 0 15px;display: none;"> <button class="btn btn-default" type="button" id="openCamera"><i class="fa fa-camera" aria-hidden="true"></i> CMND/CCCD</button> <!--<button class="btn btn-default" type="button" id="openFilePicker"><i class="fa fa-camera" aria-hidden="true"></i> Tải ảnh lên</button>--> <img alt="" width="150" height="100" style="display: none;margin: 10px auto 0;" id="imageFile" src=""> </div> <div class="form-resign2"> <div class=""> <div class="national-brand text-center mb-15"> <div class="text-uppercase"><b>Thông tin khai báo y tế</b></div> <div class="slogan"></div> </div> <div class="text-center text-uppercase"> <div class="">( Phòng chống dịch COVID-19 )</div> <div style="color: red;text-transform: none;">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</div> </div> <div class="row mb-10">
        <div class="col-md-12   col-xs-12 ">
            <label class="number-checkbox" style="font-weight: 600; font-size: 16px"><span class="mr-10">Khai hộ </span><input id="input63943" type="hidden" value="0" name="fields[otherUser]" class="style-checkbox" readonly="readonly"><input id="checkbox63943" type="checkbox" value="1" class="input63943 style-checkbox" onclick="$('#input63943').val(this.checked?1:0).change()">
            </label> </div></div><div class="row info-namPas-box">
        <div class="col-md-6 col-sm-6  col-xs-12 ">
            <div class="form-group label-240 ">
                <label>Họ tên (ghi chữ IN HOA) <em style="line-height: 1">(*)</em></label>
                <input class="form-control" name="fields[fullName]" type="text" value="" style="text-transform: uppercase;" data-msg-required="Bạn chưa nhập họ tên"> </div></div><div class="col-md-6 col-sm-6  col-xs-12 ">
        <div class="form-group  ">
            <label>Số hộ chiếu / CMND / CCCD</label>
            <input class="form-control" name="fields[passport]" type="text" value="" data-msg-required="Bạn chưa nhập CMT, hộ chiếu"> </div></div></div><div class="row ">
        <div class="col-md-4 col-sm-4  col-xs-12 ">
            <div class="form-group  ">
                <label>Năm sinh  <em style="line-height: 1">(*)</em></label>
                <input type="hidden" id="input63944" value="" class="vhv-form-number" name="fields[birthYear]"><input type="text" value="" size="16" id="numberInput63944" title="" class="formNumberInput form-control "> </div></div><div class="col-md-4 col-sm-4  col-xs-12 ">
        <div class="form-group  ">
            <label>Giới tính  <em style="line-height: 1">(*)</em></label>
            <div id="choicebox63945">

                <table class=""><tbody><tr>

                    <td><label><input type="radio" value="Nam" checked="checked" name="fields[gender]">&nbsp;Nam</label></td><td>&nbsp;</td>

                    <td><label><input type="radio" value="Nu" name="fields[gender]">&nbsp;Nữ</label></td><td>&nbsp;</td>

                    <td><label><input type="radio" value="Khac" name="fields[gender]">&nbsp;Khác</label></td><td>&nbsp;</td>


                </tr></tbody></table>


            </div> <div><label for="fields[gender]" class="error"></label></div> </div></div><div class="col-md-4 col-sm-4  col-xs-12 ">
        <div class="form-group  ">
            <label>Quốc tịch  <em style="line-height: 1">(*)</em></label>









            <select id="input63946" name="fields[nation]" style="width: 100%" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn quốc tịch" data-select2-id="input63946" tabindex="-1" aria-hidden="true">

                <option value="">Chọn</option>



                <option value="5e737e5a8fa3ecee1d74f192">Ma Cao(Trung Quốc)</option>

                <option value="5e646c48923f44349372c9a2">Hồng Kông (Trung Quốc)</option>

                <option value="5d8c3cae76801b4a0103e513">Ả Rập Xê Út</option>

                <option value="5d8c3cae76801b4a0103e514">Afghanistan</option>

                <option value="5d8c3cae76801b4a0103e515">Ai Cập</option>

                <option value="5d8c3cae76801b4a0103e516">Albania</option>

                <option value="5d8c3cae76801b4a0103e517">Algeria</option>

                <option value="5d8c3cae76801b4a0103e518">Ấn Độ</option>

                <option value="5d8c3cae76801b4a0103e519">Andorra</option>

                <option value="5d8c3cae76801b4a0103e51a">Angola</option>

                <option value="5d8c3cae76801b4a0103e51b">Anh</option>

                <option value="5d8c3cae76801b4a0103e51c">Antigua và Barbuda</option>

                <option value="5d8c3cae76801b4a0103e51d">Áo</option>

                <option value="5d8c3cae76801b4a0103e51e">Argentina</option>

                <option value="5d8c3cae76801b4a0103e51f">Armenia</option>

                <option value="5d8c3cae76801b4a0103e520">Azerbaijan</option>

                <option value="5d8c3cae76801b4a0103e521">Ba Lan</option>

                <option value="5d8c3cae76801b4a0103e522">Bắc Macedonia</option>

                <option value="5d8c3cae76801b4a0103e523">Bahamas</option>

                <option value="5d8c3cae76801b4a0103e524">Bahrain</option>

                <option value="5d8c3cae76801b4a0103e525">Bangladesh</option>

                <option value="5d8c3cae76801b4a0103e526">Barbados</option>

                <option value="5d8c3cae76801b4a0103e527">Belarus</option>

                <option value="5d8c3cae76801b4a0103e528">Belize</option>

                <option value="5d8c3cae76801b4a0103e529">Bénin</option>

                <option value="5d8c3cae76801b4a0103e52a">Bhutan</option>

                <option value="5d8c3cae76801b4a0103e52b">Bỉ</option>

                <option value="5d8c3cae76801b4a0103e52c">Bờ Biển Ngà</option>

                <option value="5d8c3cae76801b4a0103e52d">Bồ Đào Nha</option>

                <option value="5d8c3cae76801b4a0103e52e">Bolivia</option>

                <option value="5d8c3cae76801b4a0103e52f">Bosnia và Herzegovina</option>

                <option value="5d8c3cae76801b4a0103e530">Botswana</option>

                <option value="5d8c3cae76801b4a0103e531">Brazil</option>

                <option value="5d8c3cae76801b4a0103e532">Brunei</option>

                <option value="5d8c3cae76801b4a0103e533">Bulgaria</option>

                <option value="5d8c3cae76801b4a0103e534">Burkina Faso</option>

                <option value="5d8c3cae76801b4a0103e535">Burundi</option>

                <option value="5d8c3cae76801b4a0103e536">Các tiểu vương quốc Ả Rập Thống nhất</option>

                <option value="5d8c3cae76801b4a0103e537">Cameroon</option>

                <option value="5d8c3cae76801b4a0103e538">Canada</option>

                <option value="5d8c3cae76801b4a0103e539">Cape</option>

                <option value="5d8c3cae76801b4a0103e53a">Verde</option>

                <option value="5d8c3cae76801b4a0103e53b">Chad</option>

                <option value="5d8c3cae76801b4a0103e53c">Chile</option>

                <option value="5d8c3cae76801b4a0103e53d">Colombia</option>

                <option value="5d8c3cae76801b4a0103e53e">Comoros</option>

                <option value="5d8c3cae76801b4a0103e53f">Cộng hòa dân chủ Congo</option>

                <option value="5d8c3cae76801b4a0103e540">Cộng hòa Dominican</option>

                <option value="5d8c3cae76801b4a0103e541">Cộng hòa Séc</option>

                <option value="5d8c3cae76801b4a0103e542">Cộng hòa Trung Phi</option>

                <option value="5d8c3cae76801b4a0103e543">Costa Rica</option>

                <option value="5d8c3cae76801b4a0103e544">Croatia</option>

                <option value="5d8c3cae76801b4a0103e545">Cuba</option>

                <option value="5d8c3cae76801b4a0103e546">Djibouti</option>

                <option value="5d8c3cae76801b4a0103e547">Dominica</option>

                <option value="5d8c3cae76801b4a0103e548">Đài Loan ( Trung Quốc)</option>

                <option value="5d8c3cae76801b4a0103e549">Đan Mạch</option>

                <option value="5d8c3cae76801b4a0103e54a">Đông Timor</option>

                <option value="5d8c3cae76801b4a0103e54b">Đức</option>

                <option value="5d8c3cae76801b4a0103e54c">Ecuador</option>

                <option value="5d8c3cae76801b4a0103e54d">El Salvador</option>

                <option value="5d8c3cae76801b4a0103e54e">Eritrea</option>

                <option value="5d8c3cae76801b4a0103e54f">Estonia</option>

                <option value="5d8c3cae76801b4a0103e550">Ethiopia</option>

                <option value="5d8c3cae76801b4a0103e551">Fiji</option>

                <option value="5d8c3cae76801b4a0103e552">Gabon</option>

                <option value="5d8c3cae76801b4a0103e553">Gambia</option>

                <option value="5d8c3cae76801b4a0103e554">Georgia</option>

                <option value="5d8c3cae76801b4a0103e555">Ghana</option>

                <option value="5d8c3cae76801b4a0103e556">Grenada</option>

                <option value="5d8c3cae76801b4a0103e557">Guatemala</option>

                <option value="5d8c3cae76801b4a0103e558">Guinea</option>

                <option value="5d8c3cae76801b4a0103e559">Guinea Xích đạo</option>

                <option value="5d8c3cae76801b4a0103e55a">Guinea-Bissau</option>

                <option value="5d8c3cae76801b4a0103e55b">Guyana</option>

                <option value="5d8c3cae76801b4a0103e55c">Hà Lan</option>

                <option value="5d8c3cae76801b4a0103e55d">Haiti</option>

                <option value="5d8c3cae76801b4a0103e55e">Hàn Quốc</option>

                <option value="5d8c3cae76801b4a0103e55f">Hoa Kỳ</option>

                <option value="5d8c3cae76801b4a0103e560">Honduras</option>

                <option value="5d8c3cae76801b4a0103e561">Hungary</option>

                <option value="5d8c3cae76801b4a0103e562">Hy Lạp</option>

                <option value="5d8c3cae76801b4a0103e563">Iceland</option>

                <option value="5d8c3cae76801b4a0103e564">Indonesia</option>

                <option value="5d8c3cae76801b4a0103e565">Iran</option>

                <option value="5d8c3cae76801b4a0103e566">Iraq</option>

                <option value="5d8c3cae76801b4a0103e567">Ireland</option>

                <option value="5d8c3cae76801b4a0103e568">Israel</option>

                <option value="5d8c3cae76801b4a0103e569">Jamaica</option>

                <option value="5d8c3cae76801b4a0103e56a">Jordan</option>

                <option value="5d8c3cae76801b4a0103e56b">Kazakhstan</option>

                <option value="5d8c3cae76801b4a0103e56c">Kenya</option>

                <option value="5d8c3cae76801b4a0103e56d">Kiribati</option>

                <option value="5d8c3cae76801b4a0103e56e">Kosovo</option>

                <option value="5d8c3cae76801b4a0103e56f">Kuwait</option>

                <option value="5d8c3cae76801b4a0103e570">Kyrgyzstan</option>

                <option value="5d8c3cae76801b4a0103e571">Latvia</option>

                <option value="5d8c3cae76801b4a0103e572">Lesotho</option>

                <option value="5d8c3cae76801b4a0103e573">Liban</option>

                <option value="5d8c3cae76801b4a0103e574">Liberia</option>

                <option value="5d8c3cae76801b4a0103e575">Libya</option>

                <option value="5d8c3cae76801b4a0103e576">Liechtenstein</option>

                <option value="5d8c3cae76801b4a0103e577">Liên bang Micronesia</option>

                <option value="5d8c3cae76801b4a0103e578">Lithuania</option>

                <option value="5d8c3cae76801b4a0103e579">Luxembourg</option>

                <option value="5d8c3cae76801b4a0103e57a">Ma-rốc</option>

                <option value="5d8c3cae76801b4a0103e57b">Madagascar</option>

                <option value="5d8c3cae76801b4a0103e57c">Malawi</option>

                <option value="5d8c3cae76801b4a0103e57d">Malaysia</option>

                <option value="5d8c3cae76801b4a0103e57e">Maldives</option>

                <option value="5d8c3cae76801b4a0103e57f">Mali</option>

                <option value="5d8c3cae76801b4a0103e580">Malta</option>

                <option value="5d8c3cae76801b4a0103e581">Mauritania</option>

                <option value="5d8c3cae76801b4a0103e582">Mauritius</option>

                <option value="5d8c3cae76801b4a0103e583">Mexico</option>

                <option value="5d8c3cae76801b4a0103e584">Moldova</option>

                <option value="5d8c3cae76801b4a0103e585">Monaco</option>

                <option value="5d8c3cae76801b4a0103e586">Mông Cổ</option>

                <option value="5d8c3cae76801b4a0103e587">Montenegro</option>

                <option value="5d8c3cae76801b4a0103e588">Mozambique</option>

                <option value="5d8c3cae76801b4a0103e589">Myanmar</option>

                <option value="5d8c3cae76801b4a0103e58a">Na Uy</option>

                <option value="5d8c3cae76801b4a0103e58b">Nam Phi</option>

                <option value="5d8c3cae76801b4a0103e58c">Nam Sudan</option>

                <option value="5d8c3cae76801b4a0103e58d">Namibia</option>

                <option value="5d8c3cae76801b4a0103e58e">Nauru</option>

                <option value="5d8c3cae76801b4a0103e58f">Nepal</option>

                <option value="5d8c3cae76801b4a0103e590">New Zealand</option>

                <option value="5d8c3cae76801b4a0103e591">Nga</option>

                <option value="5d8c3cae76801b4a0103e592">Nhật Bản</option>

                <option value="5d8c3cae76801b4a0103e593">Nicaragua</option>

                <option value="5d8c3cae76801b4a0103e594">Niger</option>

                <option value="5d8c3cae76801b4a0103e595">Nigeria</option>

                <option value="5d8c3cae76801b4a0103e596">Oman</option>

                <option value="5d8c3cae76801b4a0103e597">Pakistan</option>

                <option value="5d8c3cae76801b4a0103e598">Palau</option>

                <option value="5d8c3cae76801b4a0103e599">Palestine</option>

                <option value="5d8c3cae76801b4a0103e59a">Panama</option>

                <option value="5d8c3cae76801b4a0103e59b">Papua New Guinea</option>

                <option value="5d8c3cae76801b4a0103e59c">Paraguay</option>

                <option value="5d8c3cae76801b4a0103e59d">Peru</option>

                <option value="5d8c3cae76801b4a0103e59e">Phần Lan</option>

                <option value="5d8c3cae76801b4a0103e59f">Pháp</option>

                <option value="5d8c3cae76801b4a0103e5a0">Philippines</option>

                <option value="5d8c3cae76801b4a0103e5a1">Qatar</option>

                <option value="5d8c3cae76801b4a0103e5a2">Quần đảo Marshall</option>

                <option value="5d8c3cae76801b4a0103e5a3">Quần đảo Solomon</option>

                <option value="5d8c3cae76801b4a0103e5a4">Romania</option>

                <option value="5d8c3cae76801b4a0103e5a5">Rwanda</option>

                <option value="5d8c3cae76801b4a0103e5a6">Saint Kitts và Nevis</option>

                <option value="5d8c3cae76801b4a0103e5a7">Saint Lucia</option>

                <option value="5d8c3cae76801b4a0103e5a8">Saint Vincent và Grenadines</option>

                <option value="5d8c3cae76801b4a0103e5a9">Samoa</option>

                <option value="5d8c3cae76801b4a0103e5aa">San Marino</option>

                <option value="5d8c3cae76801b4a0103e5ab">São Tomé và Príncipe</option>

                <option value="5d8c3cae76801b4a0103e5ac">Senegal</option>

                <option value="5d8c3cae76801b4a0103e5ad">Serbia</option>

                <option value="5d8c3cae76801b4a0103e5ae">Seychelles</option>

                <option value="5d8c3cae76801b4a0103e5af">Sierra Leone</option>

                <option value="5d8c3cae76801b4a0103e5b0">Singapore</option>

                <option value="5d8c3cae76801b4a0103e5b1">Síp</option>

                <option value="5d8c3cae76801b4a0103e5b2">Slovakia</option>

                <option value="5d8c3cae76801b4a0103e5b3">Slovenia</option>

                <option value="5d8c3cae76801b4a0103e5b4">Somalia</option>

                <option value="5d8c3cae76801b4a0103e5b5">Sri Lanka</option>

                <option value="5d8c3cae76801b4a0103e5b6">Sudan</option>

                <option value="5d8c3cae76801b4a0103e5b7">Suriname</option>

                <option value="5d8c3cae76801b4a0103e5b8">Swaziland</option>

                <option value="5d8c3cae76801b4a0103e5b9">Syria</option>

                <option value="5d8c3cae76801b4a0103e5ba">Tajikistan</option>

                <option value="5d8c3cae76801b4a0103e5bb">Tanzania</option>

                <option value="5d8c3cae76801b4a0103e5bc">Tây Ban Nha</option>

                <option value="5d8c3cae76801b4a0103e5bd">Thái Lan</option>

                <option value="5d8c3cae76801b4a0103e5be">Thành Vatican</option>

                <option value="5d8c3cae76801b4a0103e5bf">Thổ Nhĩ Kỳ</option>

                <option value="5d8c3cae76801b4a0103e5c0">Thụy Điển</option>

                <option value="5d8c3cae76801b4a0103e5c1">Thụy Sĩ</option>

                <option value="5d8c3cae76801b4a0103e5c2">Togo</option>

                <option value="5d8c3cae76801b4a0103e5c3">Tonga</option>

                <option value="5d8c3cae76801b4a0103e5c4">Triều Tiên</option>

                <option value="5d8c3cae76801b4a0103e5c5">Trinidad và Tobago</option>

                <option value="5d8c3cae76801b4a0103e5c6">Tunisia</option>

                <option value="5d8c3cae76801b4a0103e5c7">Turkmenistan</option>

                <option value="5d8c3cae76801b4a0103e5c8">Tuvalu</option>

                <option value="5d8c3cae76801b4a0103e5c9">Úc</option>

                <option value="5d8c3cae76801b4a0103e5ca">Uganda</option>

                <option value="5d8c3cae76801b4a0103e5cb">Ukraine</option>

                <option value="5d8c3cae76801b4a0103e5cc">Uruguay</option>

                <option value="5d8c3cae76801b4a0103e5cd">Uzbekistan</option>

                <option value="5d8c3cae76801b4a0103e5ce">Vanuatu</option>

                <option value="5d8c3cae76801b4a0103e5cf">Venezuela</option>

                <option value="5d8c3cae76801b4a0103e5d0">Ý</option>

                <option value="5d8c3cae76801b4a0103e5d1">Yemen</option>

                <option value="5d8c3cae76801b4a0103e5d2">Zambia</option>

                <option value="5d8c3cae76801b4a0103e5d3">Zimbabwe</option>

                <option value="5d66287a76801b3f846a3e03">Campuchia</option>

                <option value="5d66286576801b3a10054c74">Lào</option>

                <option value="5d66285476801b3f8d00fd64">Trung Quốc</option>

                <option value="5b0ec228e138230cb0072f82" selected="selected" data-select2-id="18">Việt Nam</option>

            </select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="17" style="width: 100%;"><span class="selection"><button type="button" class="select2-selection form-control select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" style="padding:0;text-align:left;" tabindex="0" aria-labelledby="select2-input63946-container"><span class="select2-selection__rendered" id="select2-input63946-container" role="textbox" aria-readonly="true" title="Việt Nam">Việt Nam</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></button></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>



        </div></div></div><div class="mb-20"><b>Địa chỉ liên lạc tại Việt Nam</b></div> <div class="row ">
        <div class="col-md-4 col-sm-4  col-xs-12 ">
            <div class="form-group  ">
                <label>Tỉnh thành  <em style="line-height: 1">(*)</em></label>









                <select id="input63947" name="fields[provinceId]" style="width: 100%" class="form-control select2-hidden-accessible" data-msg-required="Bạn chưa chọn tỉnh, thành" data-select2-id="input63947" tabindex="-1" aria-hidden="true">

                    <option value="" data-select2-id="20">Chọn</option>



                    <option value="5657e3ab7f8b9a117c8b4568">Thành phố Hà Nội</option>

                    <option value="5657e3ab7f8b9a117c8b4599">Thành phố Hồ Chí Minh</option>

                    <option value="5657e3ab7f8b9a117c8b45a0">Tỉnh An Giang</option>

                    <option value="5657e3ab7f8b9a117c8b4598">Tỉnh Bà Rịa - Vũng Tàu</option>

                    <option value="5657e3ab7f8b9a117c8b4596">Tỉnh Bình Dương</option>

                    <option value="5657e3ab7f8b9a117c8b4594">Tỉnh Bình Phước</option>

                    <option value="5657e3ab7f8b9a117c8b458e">Tỉnh Bình Thuận</option>

                    <option value="5657e3ab7f8b9a117c8b458a">Tỉnh Bình Định</option>

                    <option value="5657e3ab7f8b9a117c8b45a5">Tỉnh Bạc Liêu</option>

                    <option value="5657e3ab7f8b9a117c8b4576">Tỉnh Bắc Giang</option>

                    <option value="5657e3ab7f8b9a117c8b456b">Tỉnh Bắc Kạn</option>

                    <option value="5657e3ab7f8b9a117c8b4579">Tỉnh Bắc Ninh</option>

                    <option value="5657e3ab7f8b9a117c8b459c">Tỉnh Bến Tre</option>

                    <option value="5657e3ab7f8b9a117c8b456a">Tỉnh Cao Bằng</option>

                    <option value="5657e3ab7f8b9a117c8b45a6">Tỉnh Cà Mau</option>

                    <option value="5657e3ab7f8b9a117c8b45a2">Thành phố Cần Thơ</option>

                    <option value="5657e3ab7f8b9a117c8b456e">Tỉnh Điện Biên</option>

                    <option value="5657e3ab7f8b9a117c8b4587">Thành phố Đà Nẵng</option>

                    <option value="5657e3ab7f8b9a117c8b4591">Tỉnh Đắk Lắk</option>

                    <option value="5657e3ab7f8b9a117c8b4592">Tỉnh Đắk Nông</option>

                    <option value="5657e3ab7f8b9a117c8b4597">Tỉnh Đồng Nai</option>

                    <option value="5657e3ab7f8b9a117c8b459f">Tỉnh Đồng Tháp</option>

                    <option value="5657e3ab7f8b9a117c8b4590">Tỉnh Gia Lai</option>

                    <option value="5657e3ab7f8b9a117c8b4572">Tỉnh Hoà Bình</option>

                    <option value="5657e3ab7f8b9a117c8b4569">Tỉnh Hà Giang</option>

                    <option value="5657e3ab7f8b9a117c8b457e">Tỉnh Hà Nam</option>

                    <option value="5657e3ab7f8b9a117c8b4583">Tỉnh Hà Tĩnh</option>

                    <option value="5657e3ab7f8b9a117c8b457c">Tỉnh Hưng Yên</option>

                    <option value="5657e3ab7f8b9a117c8b457a">Tỉnh Hải Dương</option>

                    <option value="5657e3ab7f8b9a117c8b457b">Thành phố Hải Phòng</option>

                    <option value="5657e3ab7f8b9a117c8b45a3">Tỉnh Hậu Giang</option>

                    <option value="5657e3ab7f8b9a117c8b458c">Tỉnh Khánh Hòa</option>

                    <option value="5657e3ab7f8b9a117c8b45a1">Tỉnh Kiên Giang</option>

                    <option value="5657e3ab7f8b9a117c8b458f">Tỉnh Kon Tum</option>

                    <option value="5657e3ab7f8b9a117c8b456f">Tỉnh Lai Châu</option>

                    <option value="5657e3ab7f8b9a117c8b459a">Tỉnh Long An</option>

                    <option value="5657e3ab7f8b9a117c8b456d">Tỉnh Lào Cai</option>

                    <option value="5657e3ab7f8b9a117c8b4593">Tỉnh Lâm Đồng</option>

                    <option value="5657e3ab7f8b9a117c8b4574">Tỉnh Lạng Sơn</option>

                    <option value="5657e3ab7f8b9a117c8b457f">Tỉnh Nam Định</option>

                    <option value="5657e3ab7f8b9a117c8b4582">Tỉnh Nghệ An</option>

                    <option value="5657e3ab7f8b9a117c8b4580">Tỉnh Ninh Bình</option>

                    <option value="5657e3ab7f8b9a117c8b458d">Tỉnh Ninh Thuận</option>

                    <option value="5657e3ab7f8b9a117c8b4577">Tỉnh Phú Thọ</option>

                    <option value="5657e3ab7f8b9a117c8b458b">Tỉnh Phú Yên</option>

                    <option value="5657e3ab7f8b9a117c8b4584">Tỉnh Quảng Bình</option>

                    <option value="5657e3ab7f8b9a117c8b4588">Tỉnh Quảng Nam</option>

                    <option value="5657e3ab7f8b9a117c8b4589">Tỉnh Quảng Ngãi</option>

                    <option value="5657e3ab7f8b9a117c8b4575">Tỉnh Quảng Ninh</option>

                    <option value="5657e3ab7f8b9a117c8b4585">Tỉnh Quảng Trị</option>

                    <option value="5657e3ab7f8b9a117c8b45a4">Tỉnh Sóc Trăng</option>

                    <option value="5657e3ab7f8b9a117c8b4570">Tỉnh Sơn La</option>

                    <option value="5657e3ab7f8b9a117c8b4581">Tỉnh Thanh Hóa</option>

                    <option value="5657e3ab7f8b9a117c8b457d">Tỉnh Thái Bình</option>

                    <option value="5657e3ab7f8b9a117c8b4573">Tỉnh Thái Nguyên</option>

                    <option value="5657e3ab7f8b9a117c8b4586">Tỉnh Thừa Thiên Huế</option>

                    <option value="5657e3ab7f8b9a117c8b459b">Tỉnh Tiền Giang</option>

                    <option value="5657e3ab7f8b9a117c8b459d">Tỉnh Trà Vinh</option>

                    <option value="5657e3ab7f8b9a117c8b456c">Tỉnh Tuyên Quang</option>

                    <option value="5657e3ab7f8b9a117c8b4595">Tỉnh Tây Ninh</option>

                    <option value="5657e3ab7f8b9a117c8b459e">Tỉnh Vĩnh Long</option>

                    <option value="5657e3ab7f8b9a117c8b4578">Tỉnh Vĩnh Phúc</option>

                    <option value="5657e3ab7f8b9a117c8b4571">Tỉnh Yên Bái</option>

                </select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="19" style="width: 100%;"><span class="selection"><button type="button" class="select2-selection form-control select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" style="padding:0;text-align:left;" tabindex="0" aria-labelledby="select2-input63947-container"><span class="select2-selection__rendered" id="select2-input63947-container" role="textbox" aria-readonly="true" title="Chọn">Chọn</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></button></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>



            </div></div><div class="col-md-4 col-sm-4  col-xs-12 ">
        <div class="form-group  ">
            <label>Quận / huyện  <em style="line-height: 1">(*)</em></label>









            <select id="input63948" name="fields[districtId]" style="width: 100%" class="form-control select2-hidden-accessible" data-x-cascade="fields[provinceId]:provinceId" data-msg-required="Bạn chưa chọn quận, huyện" data-select2-id="input63948" tabindex="-1" aria-hidden="true">

                <option value="" data-select2-id="22">Chọn</option>



            </select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="21" style="width: 100%;"><span class="selection"><button type="button" class="select2-selection form-control select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" style="padding:0;text-align:left;" tabindex="0" aria-labelledby="select2-input63948-container"><span class="select2-selection__rendered" id="select2-input63948-container" role="textbox" aria-readonly="true" title="Chọn">Chọn</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></button></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>



        </div></div><div class="col-md-4 col-sm-4  col-xs-12 ">
        <div class="form-group  ">
            <label>Phường / xã  <em style="line-height: 1">(*)</em></label>









            <select id="input63949" name="fields[wardId]" style="width: 100%" class="form-control select2-hidden-accessible" data-x-cascade="fields[districtId]:districtId" data-msg-required="Bạn chưa chọn phường, xã" data-select2-id="input63949" tabindex="-1" aria-hidden="true">

                <option value="" data-select2-id="24">Chọn</option>



            </select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="23" style="width: 100%;"><span class="selection"><button type="button" class="select2-selection form-control select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" style="padding:0;text-align:left;" tabindex="0" aria-labelledby="select2-input63949-container"><span class="select2-selection__rendered" id="select2-input63949-container" role="textbox" aria-readonly="true" title="Chọn">Chọn</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></button></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>



        </div></div></div><div class="row ">
        <div class="   col-xs-12 ">
            <div class="form-group  ">
                <label>Số nhà, phố, tổ dân phố/thôn/đội <em style="line-height: 1">(*)</em></label>
                <input class="form-control" name="fields[address]" type="text" value="" data-msg-required="Bạn chưa nhập địa chỉ"> </div></div></div><div class="row ">
        <div class="col-md-6 col-sm-6  col-xs-12 ">
            <div class="form-group  ">
                <label>Điện thoại  <em style="line-height: 1">(*)</em></label>
                <input class="form-control" name="fields[phone]" type="number" value="0979642710" data-mgs-number="Số điện thoại chỉ được nhập số" data-msg-required="Bạn chưa nhập điện thoại">
            </div></div><div class="col-md-6 col-sm-6  col-xs-12 ">
        <div class="form-group  ">
            <label>Email </label>
            <input class="form-control" name="fields[email]" data-msg-email="Email không đúng định dạng" type="text" value="" onblur="this.value=removeSpaces(this.value);"> </div></div></div><div class="row ">
        <div class="   col-xs-12 ">
            <div class="form-group form-lenght ">
                <label>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố, quốc gia/vùng lãnh thổ nào (Có thể đi qua nhiều nơi)</label>
                <div class="mt-10 inline-block pl-10"> <input type="radio" name="fields[showCountryPassing]" value="0" class="style-radio" checked=""> Không
                    <input type="radio" name="fields[showCountryPassing]" value="1" data-x-group="2" class="style-radio"> Có
                </div> <div class="mt-10 showCountryPassing" style="display: none">
                <div style="clear:both"><textarea class="input63950 form-control" id="input63950" style="/**/height:200pxpx;" name="fields[countryPassing]" disabled="disabled"></textarea>
                </div> </div> </div></div></div><input type="hidden" name="fields[isLocalTransport]" value="2"> <div class="form-group form-lenght ">
        <label>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện ít nhất 1 trong các dấu hiệu: sốt, ho, khó thở, viêm phổi, đau họng, mệt mỏi không?</label>
        <div class="mt-10 inline-block pl-10"> <input type="radio" name="fields[showSignal]" value="0" class="style-radio" checked=""> Không
            <input type="radio" name="fields[showSignal]" value="1" data-x-group="1" class="style-radio"> Có
        </div> <div class="mt-10 showSignal" style="display: none">
        <div style="clear:both"><textarea class="input63951 form-control" id="input63951" style="/**/height:200pxpx;" name="fields[showSignalNote]" disabled="disabled"></textarea>
        </div> </div> </div><div class="mb-10"><b>Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với <span class="text-required">(*)</span></b></div> <div class="row ">
        <div class="   col-xs-12 ">
            <table class="table table-bordered tableData2"> <thead> <tr> <th scope="col"></th> <th scope="col" style="width:100px;" class="text-center">Có</th> <th scope="col" style="width:100px;" class="text-center">Không</th> </tr> </thead> <tbody> <tr> <td>Người bệnh hoặc nghi ngờ, mắc bệnh COVID-19 <span class="text-required">(*)</span><br><label class="error" for="fields[hasPatient]"></label></td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasPatient]" value="1" data-msg-required="Bạn chưa chọn lịch sử tiếp xúc">
            </td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasPatient]" value="2" checked="">
            </td> </tr> <tr> <td>Người từ nước có bệnh COVID-19 <span class="text-required">(*)</span><br><label class="error" for="fields[hasFromSickCountry]"></label></td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasFromSickCountry]" value="1" data-msg-required="Bạn chưa chọn lịch sử tiếp xúc">
            </td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasFromSickCountry]" value="2" checked="">
            </td> </tr> <tr> <td>Người có biểu hiện (Sốt, ho, khó thở , Viêm phổi) <span class="text-required">(*)</span><br><label class="error" for="fields[hasSick]"></label></td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasSick]" value="1" data-msg-required="Bạn chưa chọn lịch sử tiếp xúc">
            </td> <td class="text-center"> <input type="Radio" class="style-radio" name="fields[hasSick]" value="2" checked="">
            </td> </tr> </tbody> </table> </div></div><div class="form-group inline-block form-inline label-width ">
        <label>Mã bảo mật  <em style="line-height: 1">(*)</em></label>
        <div class="form-captcha">

            <div class="div-pc-capcha">
                <div class="img-cap-mobile" style="vertical-align:middle;position: relative;text-align:left">
                    <a class="captcha-refresh" href="javascript:void(0);" onclick="$(this).find('img').attr('src', '/api/Common/Captcha/getCaptcha?returnType=image&amp;site=2001432&amp;width='+($(window).outerWidth() >= 414 ? 150 : 120)+'&amp;height=50&amp;t='+(new Date().getTime()));"><img alt="" src="/api/Common/Captcha/getCaptcha?returnType=image&amp;site=2001432&amp;width=150&amp;height=50&amp;t=1646215639"><i class="far fa-sync-alt ml-10" aria-hidden="true" style="font-size: 20px;font-weight: 600;color: #ff0000"></i></a>
                </div>
                <div class="input-capt" style="vertical-align:middle;text-align:left;"><input type="text" id="captcha_code" onblur="this.value=removeSpaces(this.value);" name="captcha_code" class="form-control capcha-text" required="required" data-msg-required="Bạn chưa nhập mã bảo mật " aria-required="true"></div>
            </div>

            <label class="error hide1" generated="true" for="captcha"></label>

            <div class="clear-both"></div>
        </div>
        <style>
            .div-pc-capcha{
                display: flex;
                align-items: center;
            }
            .div-pc-capcha .img-cap-mobile{
                width: 50%;
            }
            .div-pc-capcha .input-capt{
                width: 50%;
            }
            .form-captcha table{
                width: 100%;
            }
            .form-captcha table tbody{
                display: flex;
                align-items: center;
            }
            .form-captcha a.captcha-refresh{
                padding-right: 0;
                display: block;
                min-width: 190px;
            }
            @media (max-width: 425px) {
                .form-captcha a.captcha-refresh{
                    display: inline-flex;
                    align-items: center;
                }
            }
            @media(max-width: 375px){
                .form-captcha a.captcha-refresh{
                    display: block;
                }
            }
            .captcha-mobile{
                display: flex;
                flex-wrap: wrap;
                max-width: 320px;
                align-items: center;
            }
            .captcha-mobile .img-cap-mobile{
                width: 60%;
            }
            .captcha-mobile .input-capt{
                width: 40%;
            }
        </style> </div><div class="agreeWrapper 456">  <div class="label-agree">Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch, thuộc quản lý của Ban chỉ đạo quốc gia về Phòng chống dịch Covid-19. Khi bạn nhấn nút "Gửi" là bạn đã hiểu và đồng ý.</div> </div><style> .agreeWrapper .label-agree{ color:#f00; margin-bottom: 20px; word-break: break-word; line-height: 22px; }
    </style> <div class="btn-submit-box text-center"> <button type="submit" class="btn btn-success">Gửi tờ khai</button> </div> </div></div><style> .info-namPas-box label { display: block !important; }
    .info-comCode-box label { display: block !important; }
    @media screen and (max-width: 767px){ .form-resign2 .tableChoiceData{ display: block; }
        .form-resign2 .tableChoiceData .table{ margin-bottom: 0; }
        .form-resign2 .tableChoiceData .cols-right{ margin-top: -1px; }
        .form-resign2 .tableChoiceData .table > tbody>tr>td:nth-child(1){ min-width: 140px; }
        .form-resign2 .tableChoiceData .cols-right .table > thead{ display: none; }
        .form-resign2 .tableChoiceData .cols-right .table > tbody>tr>td+td{ width: 100px; }
        .form-resign2 { font-size: 16px; }
        .form-resign2 .table { font-size: 14px; }
    }
    @media screen and (max-width: 480px){ .form-resign2 .tableChoiceData .cols-right .table > tbody>tr>td:nth-child(2), .tableChoiceData .table > tbody>tr>td:nth-child(2){ min-width: 50px; }
        .form-resign2 .tableChoiceData .cols-right .table > tbody>tr>td:nth-child(3), .form-resign2 .tableChoiceData .table > tbody>tr>td:nth-child(3){ min-width: 60px; }
    }
    .form-resign2 span.text-required { color: red; }
    .form-resign2 label em{ color: red; }
    .form-resign2{ padding: 15px; background:#fff; }
    .form-resign2 label{ font-weight:normal; }
    .form-resign2 .national-brand .text-uppercase{ font-size:20px; }
    .form-resign2 .national-brand .text-2{ display:inline-block; border-bottom:1px solid #333; padding:8px 0; font-size:13px; margin-bottom:8px; }
    .form-resign2 .text-center.text-uppercase{ font-weight: bold; line-height: 35px; padding-bottom: 40px; font-size: 13px; }
    .request-form >.panel-body{ padding:0; }
    .request-form >.panel-body >.modal-body{ padding:0; }
    .request-form .form-inline.form-control{ border: none; box-shadow: none; outline: none; border-bottom: 1px dotted #262626; border-radius: 0; vertical-align: middle; }
    .formWrapper .tableChoiceData{ display: flex; }
    .formWrapper .tableChoiceData > div{ flex: 1; }
    @media (min-width: 769px){ .label-width.form-inline .form-control{ width: 300px!important; }
        .form-inline .form-control { width: auto !important; vertical-align: top; }
    }
    @media screen and (max-width: 767px){ .formWrapper .tableChoiceData{ display: block; }
        .formWrapper .tableChoiceData .table{ margin-bottom: 0; }
        .formWrapper .tableChoiceData .cols-right{ margin-top: -1px; }
        .formWrapper .tableChoiceData .table > tbody>tr>td:nth-child(1){ min-width: 140px; }
        .formWrapper .tableChoiceData .cols-right .table > thead{ display: none; }
        .formWrapper .tableChoiceData .cols-right .table > tbody>tr>td+td{ width: 100px; }
    }
    @media screen and (max-width: 480px){ .formWrapper .tableChoiceData .cols-right .table > tbody>tr>td:nth-child(2), .formWrapper .tableChoiceData .table > tbody>tr>td:nth-child(2){ min-width: 50px; }
        .formWrapper .tableChoiceData .cols-right .table > tbody>tr>td:nth-child(3), .formWrapper .tableChoiceData .table > tbody>tr>td:nth-child(3){ min-width: 60px; }
    }
    @media (max-width: 768px){ .form-inline .form-control.input-year{ width: 100% !important; }
        .box-gaden label{ display: block; }
        .passenger-wrapper .box-edit-layout .box-gaden.form-group:not(.group-input-inline) .select2-container.select2-container--default { width: 100% !important; }
    }
    #module2009 .form-resign2>div>div:nth-child(4)>div:nth-child(1) label,#module2009 .form-resign2>div>div:nth-child(3)>div:nth-child(1) label, #module2009.form-resign2>div>div:nth-child(5)>div:nth-child(1) label { display: inline-block; width: 210px !important; }
    @media screen and (min-width: 1024px) { .passenger-wrapper .box-edit-layout .form-group:not(.group-input-inline) .select2-container.select2-container--default { width: 100% !important; }
    }
    .form-lenght >label{ width: auto; font-weight: 700; }
    </style> </div> </div> <input type="hidden" name="securityToken" value="70cf5d3a23b632ff3da2fd126264ae053f1dd857b78ea29e55f7a6807ef59243"><input type="hidden" name="submitFormId" value="2009"><input type="hidden" name="moduleId" value="2009"></form></div>
    <style> .btn-save { background-color: #5cb85c; border: 1px solid #5cb85c; transition: all 150ms linear; color: #fff; padding: 6px 16px 6px 16px; min-width: 72px; }
    .btn-save:hover { color: #fff; background-color: #449d44; border: 1px solid #449d44; }
    .box-edit-layout .select2-container.select2-container--default{ max-width: 100%; width: 100% !important; }
    .header-action .btn-group.dropup a.btn-action{ margin-right: 5px; border-radius: 4px !important; }
    .header-action .btn-group.dropup a.btn-action:last-of-type{ margin-right: 0; }
    </style><style> .form-resign2 .tableChoiceData table tbody { white-space: normal; }
    @media (max-width: 425px) { .insurance-box input{ margin-bottom: 5px; }
    }
    @media (min-width: 769px) { .label-width.form-inline .form-control { max-width: 299px !important; width: 299px !important; }
    }
    @media(max-width: 768px){ .label-width.form-inline .form-control{ width: 100% !important; }
    }
    @media screen and (min-width: 1024px) { .artile-edit-layout .form-resign2 .label-width.form-inline .form-control.form-inline:not(.full-width) { max-width: 299px !important; width: 299px !important; }
    }
    @media screen and (min-width: 1024px) { .artile-edit-layout .form-resign2 .label-width.form-inline .form-control.form-inline:not(.full-width) { max-width: 299px !important; width: 299px !important; }
    }
    @media(max-width: 425px) { .info-namPas-box label { width: auto !important; white-space: nowrap; }
    }
    .form-resign2 span.text-required { color: red; font-style: italic; }
    .insurance-box label{ display: inline-block; width: 240px !important; }
    .label-width label { display: inline-block; width: 220px; }
    .gender-box label{ width: 220px; display: inline-block; }
    .form-resign2 .form-group.box-gaden>label{ display: unset; }
    @media(min-width: 1024px) { .passenger-wrapper .box-edit-layout .form-group.box-gaden:not(.group-input-inline) .select2-container.select2-container--default{ width: auto !important; }
    }
    @media (min-width: 768px) { input.form-control.inline-block.form-inline { min-width: 250px; }
    }
    .box-edit-layout .insurance-box { margin-bottom: 15px; }
    .box-edit-layout .insurance-box .form-group { margin-bottom: 0; }
    .box-edit-layout .insurance-box-inside { margin-top: 15px; }
    @media screen and (min-width: 1024px) { #module7 .artile-edit-layout .form-resign2 .select2-container.select2-container--default { width: auto !important; min-width: 240px; }
    }
    .mt-30{ margin-top: 30px; }
    #module2009 .sendType-option input{ display: none !important; }
    #module2009 .sendType-option label{ cursor: pointer; }
    #module2009 .sendType-option input + img{ padding: 2px; border: 1px solid #eaeaea; }
    #module2009 .sendType-option input:checked + img{ border-color:#0a6dd4; }
    #module2009 .list-select li{ margin-bottom: 15px; display: -webkit-flex; display: flex; display: flex; }
    #module2009 .list-select span{ width: calc(100% - 105px); display: inline-block; padding-right: 10px; margin-top: -5px; }
    .formWrapper .btn-larger{ font-size: 21px; padding-left: 25px; padding-right: 25px; border-radius: 25px; }
    @media(max-width: 425px) { .form-control.capcha-text{ min-width: 150px; }
    }
    input::-webkit-outer-spin-button, input::-webkit-inner-spin-button { -webkit-appearance: none; margin: 0; }
    input[type=number] { -moz-appearance: textfield; }
    .row-eq-height { display: flex; flex-wrap: wrap; }
    </style></div><script type="text/javascript">;
</script>
    <script id="script63944"> VHV.load('Common.Input.Number', function(){ (new VHV.Common.Input.Number($('#input63944'), {"type":"Form.Number","class":"form-control","data-msg-required":"B\u1ea1n ch\u01b0a nh\u1eadp n\u0103m sinh","name":"fields[birthYear]","max":"2022","noSep":"1","value":"","inputCount":63944,"multiLanguage":false,"currency":"VND","mid":2009,"moduleId":2009})).draw(); });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63946">
        VHV.load('Common.Input.Select', function(){
            (new VHV.Common.Input.Select($('#input63946'), {"type":"Form.Select","class":"form-control","name":"fields[nation]","service":"Content.Region.selectCountries","description":"Ch\u1ecdn","value":"5b0ec228e138230cb0072f82","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn qu\u1ed1c t\u1ecbch"},"style":"width: 100%","totalItems":199,"inputCount":63946,"multiLanguage":false,"currency":"VND","mid":2009,"language":"vi","moduleId":2009})).draw();
        });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63947">
        VHV.load('Common.Input.Select', function(){
            (new VHV.Common.Input.Select($('#input63947'), {"type":"Form.Select","class":"form-control","name":"fields[provinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn t\u1ec9nh, th\u00e0nh"},"service":"Content.Region.selectProvinces","value":"","description":"Ch\u1ecdn","style":"width: 100%","totalItems":63,"inputCount":63947,"multiLanguage":false,"currency":"VND","mid":2009,"language":"vi","moduleId":2009})).draw();
        });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63948">
        VHV.load('Common.Input.Select', function(){
            (new VHV.Common.Input.Select($('#input63948'), {"type":"Form.Select","class":"form-control","name":"fields[districtId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn qu\u1eadn, huy\u1ec7n"},"service":"Content.Region.selectDistricts","value":"","description":"Ch\u1ecdn","data-x-cascade":"fields[provinceId]:provinceId","style":"width: 100%","totalItems":0,"inputCount":63948,"multiLanguage":false,"currency":"VND","mid":2009,"language":"vi","moduleId":2009})).draw();
        });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63949">
        VHV.load('Common.Input.Select', function(){
            (new VHV.Common.Input.Select($('#input63949'), {"type":"Form.Select","class":"form-control","name":"fields[wardId]","description":"Ch\u1ecdn","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn ph\u01b0\u1eddng, x\u00e3"},"service":"Content.Region.selectWards","value":"","data-x-cascade":"fields[districtId]:districtId","style":"width: 100%","totalItems":0,"inputCount":63949,"multiLanguage":false,"currency":"VND","mid":2009,"language":"vi","moduleId":2009})).draw();
        });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63950"> VHV.load('Common.Input.TextArea', function(){ (new VHV.Common.Input.TextArea($('#input63950'), {"type":"Form.TextArea","class":"form-control","name":"fields[countryPassing]","height":"200px","value":"","inputCount":63950,"multiLanguage":false,"currency":"VND","mid":2009,"richEditorType":"","richEditorToolbar":"","textLimitSize":"","moduleId":2009})).draw(); });
    </script>
    <script type="text/javascript">
        ;
    </script>
    <script id="script63951"> VHV.load('Common.Input.TextArea', function(){ (new VHV.Common.Input.TextArea($('#input63951'), {"type":"Form.TextArea","class":"form-control","name":"fields[showSignalNote]","height":"200px","value":"","inputCount":63951,"multiLanguage":false,"currency":"VND","mid":2009,"richEditorType":"","richEditorToolbar":"","textLimitSize":"","moduleId":2009})).draw(); });
    </script>
    <script type="text/javascript">
        ;
        function removeSpaces(string) {
            return string.trim();
        }
        if($(window).outerWidth() < 414){
            $('.captcha-refresh img').attr('src', $('.captcha-refresh img').attr('src').replace('width=150','width=150'));
        }
        ;
        $('.backLink').on('click',function () { if(window.localStorage) { var backLink = localStorage.getItem('backLink'); if(backLink){ location = backLink; }else{
            history.back(); }
        }
        });
        function removeSpaces(string) { return string.trim(); }
        var onSuccess = function(position) { $('#form2009 [name="fields[lat]"]').val(position.coords.latitude); $('#form2009 [name="fields[long]"]').val(position.coords.longitude); VHV.Model('Project.TKYT.MemberLocation.updateLocationInfo')({ code: '0979642710', deviceId: '', lat: position.coords.latitude, long: position.coords.longitude },function(response) {
        });
        };
        function onError(error) { $('#form2009 [name="fields[lat]"]').val(''); $('#form2009 [name="fields[long]"]').val(''); }
        navigator.geolocation.getCurrentPosition(onSuccess,onError); function setOptions(srcType) { var options = { // Some common settings are 20, 50, and 100
            quality: 10, destinationType: Camera.DestinationType.DATA_URL, // In this app, dynamically set the picture source, Camera or photo gallery
            sourceType: srcType, encodingType: Camera.EncodingType.JPEG, mediaType: Camera.MediaType.PICTURE, allowEdit: true, correctOrientation: true, //Corrects Android orientation quirks
            targetHeight: 1000, targetWidth: 1000 };
            return options; }
        function openCamera() { var srcType = Camera.PictureSourceType.CAMERA; var options = setOptions(srcType); //var func = createNewFileEntry;
            navigator.camera.getPicture(function cameraSuccess(imageData) { var src = "data:image/jpeg;base64," + imageData; displayImage(src); fillData(src); // You may choose to copy the picture, save it somewhere, or upload.
//createNewFileEntry(imageUri);
            }, function cameraError(error) {
                VHV.alert("Unable to obtain picture: " + error, "app"); }, options);
        }
        function openFilePicker() { var srcType = Camera.PictureSourceType.SAVEDPHOTOALBUM; var options = setOptions(srcType); //var func = createNewFileEntry;
            navigator.camera.getPicture(function cameraSuccess(imageData) { displayImage(imageData); }, function cameraError(error) {
                console.debug("Unable to obtain picture: " + error, "app"); }, options);
        }
        function displayImage(src) { $('#form2009 #imageFile').attr('src',src).css('display','block'); }
        function fillData(src){ $('#form2009 [name="fields[file]"]').val(src); VHV.Model('Project.TKYT.OCR.getInfoPassport')({ image: src }, function(response){
            if (typeof(response) == 'string') { response = JSON.parse(response); }
            if(response.fullName){ $('#form2009 [name="fields[fullName]"]').val(response.fullName.toUpperCase()); }
            if(response.birthYear){ $('#form2009 [name="fields[birthYear]"] option[value="'+response.birthYear+'"]').attr('selected','selected'); }
            if(response.gender){ $('#form2009 [name="fields[gender]"] option[value="'+response.gender+'"]').attr('selected','selected'); }
            if(response.passport){ $('#form2009 [name="fields[passport]"]').val(response.passport); }
            if(response.address){ $('#form2009 [name="fields[address]"]').val(response.address); }
            if(response.id_check){ $('#form2009 [name="fields[idCheck]"]').val(response.id_check); }
            if(response.id_logic){ $('#form2009 [name="fields[idLogic]"]').val(response.id_logic); }
            if(response.id_type){ $('#form2009 [name="fields[idType]"]').val(response.id_type); }
            if(response.idconf){ $('#form2009 [name="fields[idconf]"]').val(response.idconf); }
        });
        }
        if(0 && navigator.camera){ $('#form2009 [name="fields[fullName]"').parents('.row:first').prepend($('#camera2009')); $('#camera2009').show(); $('#openCamera').click(function() { openCamera(); });
            $('#openFilePicker').click(function() { openFilePicker(); });
        }
        setTimeout(function(){ if($('#form2009 select[name="fields[provinceId]"]').val()){ $('#form2009 select[name="fields[provinceId]"]').change(); }
        }, 1000);
        $('#form2009 [name="fields[lang]"]').change(function(){ var langView = $(this).val(); switch (langView) { case 'lo': VHV.App.modules[2009].langView = 'lo'; VHV.App.modules[2009].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editLo"; break; case 'en': VHV.App.modules[2009].langView = 'en'; VHV.App.modules[2009].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editEn"; break; default: VHV.App.modules[2009].langView = 'vi'; VHV.App.modules[2009].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editVi"; break; }
            $('#module2009 .form-resign2').css('opacity',0); VHV.App.modules[2009].reload(); });
        $('#form2009').on('change','.healthinSuranceIdCard-check', function () { if($(this).is(':checked')){ $('#form2009 [name="fields[healthinSuranceIdCard]"]').attr('required',true); $(this).next().show(); }else{
            $('#form2009 [name="fields[healthinSuranceIdCard]"]').val('').attr('required',false); $(this).next().hide(); }
        });
        var wrapper = $('.local-transport-wrap2009'), inputs = wrapper.find('[name^="fields["]'); function transport2009(isTransport){ if(wrapper && inputs) { if (isTransport) { inputs.each(function () { var newName = 'fields[' + $(this).attr('name') + ']'; $(this).attr('name', newName); });
            wrapper.show(); } else {
            inputs.each(function () { var newName = $(this).attr('name').replace('fields[', '').replace(']', ''); $(this).attr('name', newName); });
            wrapper.hide(); }
        }
        }
        var errorTitle = 'Lỗi'; errorTitle = 'Lỗi'; var errorTitleNoti = 'Có lỗi', successTitle = 'Thành công'; errorTitleNoti = 'Có lỗi'; successTitle = 'Thành công'; VHV.using ($.extend(
            $.parseJSON(decode64('eyJzZXJ2aWNlIjoiUHJvamVjdC5US1lULkhvbWUuSGVhbHRoLnNlbGVjdEluZm8iLCJsYXlvdXQiOiJQcm9qZWN0LlRLWVQuR3JvdXAuSGVhbHRoUmVjb3JkLkhlYWx0aE1vbml0b3JpbmcuZWRpdCIsInN1Ym1pdFNlcnZpY2UiOiJQcm9qZWN0LlRLWVQuSG9tZS5IZWFsdGguZWRpdCIsInBhdGgiOiJDb250ZW50In0=')),{"module":"Content.Form","page":"","id":"2009","modulePosition":"0","moduleParentId":"-1"}),{ notPlaceholder:true, filters: [], insuranceData: [], healthinSuranceIdCard: "", gender: "", provinceId: "", districtId: "", wardId: "", address: "", passport: "", phone: "0979642710", hasCaptcha: "1", hideHeader: "1", itemId: "", lang: false, langView: false, healthId: "", hasLocalTransport: false, errorBoxTitle: errorTitle, checkHealthInsurance: function() { var that = this; var form = $('#form' + that.id), service = 'Project.TKYT.API.HSSK.getPatientInfo', fullName = form.find('[name="fields[fullName]"]').val(), healthInsuranceNumber = form.find('[name="fields[healthinSuranceIdCard]"]').val(), birthYear = form.find('[name="fields[birthYear]"]').val(); VHV.Model(service)({ healthInsuranceNumber: healthInsuranceNumber, fullName: fullName, birthYear: birthYear, langView: "vi" }, function(response) {
                if(typeof(response) === 'string'){ response = JSON.parse(response); }
                if(response.status == 'SUCCESS') { delete response.status; VHV.App.modules[2009].insuranceData = JSON.stringify(response); VHV.alert(response.message ? response.message : 'Lấy thông tin thẻ thành công', { 'delay': 3000, 'type': 'success' });
                    VHV.App.modules[2009].reload(); } else {
                    VHV.alert(response.message ? response.message : 'Thao tác thất bại', { 'delay': 3000, 'type': 'error' });
                }
            });
            },
            rules:{ 'fields[fullName]': { required:true, maxlength: 255, },
                'fields[email]': { email:true, },
                'fields[passport]': { regex: /^[a-zA-Z0-9]*$/ },
                'fields[provinceId]': { required:true, },
                'fields[phone]': { required:true, phoneVN: true },
                'fields[birthYear]': { required:true, maxlength:4, minlength: 4, min: 1900, max: 2022 },
                'fields[gender]': { required:true, },
                'fields[nation]': { required:true, },
                'fields[address]': { required:true, },
                /*
                'fields[hasFever]': { required:true, },
                'fields[hasCough]': { required:true, },
                'fields[hasPneumonia]': { required:true, },
                'fields[hasBreath]': { required:true, },
                'fields[hasSoreThroat]': { required:true, },
                'fields[hasFatigue]': { required:true, },*/
                'fields[hasFromSickCountry]': { required:true, },
                'fields[hasPatient]': { required:true, },
                'fields[hasSick]': { required:true, },
                /*'fields[hasChronicLiver]': {
                required:true, },
                'fields[hasChronicBlood]': { required:true, },
                'fields[hasChronicLung]': { required:true, },
                'fields[hasChronicKidney]': { required:true, },
                'fields[hasHeartrelated]': { required:true, },
                'fields[hasHighBloodPressure]': { required:true, },
                'fields[hasHIV]': { required:true, },
                'fields[hasOrganTransplant]': { required:true, },
                'fields[hasDiabet]': { required:true, },
                'fields[hasCancer]': { required:true, },
                'fields[hasPregnant]': { required:true, },*/
                'fields[proviceId]': { required:true, },
                'fields[districtId]': { required:true, },
                'fields[wardId]': { required:true, },
                'fields[countryPassing]': { required:true, },
                'fields[showSignalNote]': { required:true, },
                'fields[healthinSuranceIdCard]':{ minlength: 8, maxlength: 17 },
                'fields[vehicle]':{ required:true, },
                'fields[startProvinceId]':{ required:true, },
                'fields[startDistrictId]':{ required:true, },
                'fields[startWardId]':{ required:true, },
                'fields[endProvinceId]':{ required:true, },
                'fields[endDistrictId]':{ required:true, },
                'fields[endWardId]':{ required:true, },
                'fields[startGateId]':{ required:true, },
                'fields[endGateId]':{ required:true, },
                'fields[vehicleCode]':{ required:true, },
                'fields[isLocalTransport]':{ required:true, },
                'fields[startTime]':{ required:true, dateVN: true, },
            },
            messages: { 'fields[startTime]':{ dateVN: "Ngày tháng không đúng định dạng dd/mm/YYYY hoặc không tồn tại", },
                'fields[fullName]':{ maxlength: "Họ tên không được vượt quá 225 ký tự", },
                'fields[passport]': { regex: "Số hộ chiếu hoặc CMND chỉ được nhập chữ không dấu và số", },
                'fields[birthYear]':{ maxlength: "Năm sinh nhập tối đa 4 ký tự số", minlength: "Năm sinh nhập tối thiểu 4 ký tự số", required: "Bạn chưa nhập năm sinh", min: "Vui lòng nhập giá trị lớn hơn hoặc bằng năm 1900", max: "Vui lòng nhập giá trị nhỏ hơn hoặc bằng năm "+2022 },
                'fields[gender]': { required: "Bạn chưa chọn giới tính", },
                'fields[countryPassing]':{ required: "Bạn chưa nhập những nơi đã đi qua trong vòng 14 ngày qua", },
                'fields[showSignalNote]':{ required: "Bạn chưa nhập các dấu hiệu", },
                'fields[phone]':{ phoneVN: "Số điện thoại không hợp lệ", number: "Số điện thoại chỉ được nhập giá trị là số" },
                'fields[companyId]':{ required: "Đơn vị công tác không được để trống" },
                'fields[vehicle]':{ required: "Bạn chưa chọn phương tiện đi lại", },
                'fields[healthinSuranceIdCard]':{ minlength: 'Số thẻ bảo hiểm y tế phải lớn hơn 8 và nhỏ hơn 17 kí tự', maxlength: 'Số thẻ bảo hiểm y tế phải lớn hơn 8 và nhỏ hơn 17 kí tự' },
            },
            saveLastForm: function(){ var data = { };
                this.$('[name^="fields["]').each(function(){ var name; if(/^fields\[(\w+)\]$/.test(this.name)){ name = RegExp.$1; }
                else{ return; }
                    if(['fullName', 'passport', 'phone', 'email', 'seat', 'birthYear', 'deviceId','ip','lat','long','lang'].indexOf(name) != -1 || name.indexOf('has') == 0){ return; }
                    var value = this.value; if(this.type == 'radio' || this.type == 'checkbox'){ if(!this.checked) return; }
                    data[name] = value; });
                localStorage.setItem('lastHMDecl', JSON.stringify(data)); },
            success: function (response) { $('#module2009 .captcha-refresh').click(); if(response == 'BotDetect'){ var alert = 'Mã bảo mật sai'; VHV.alert(alert,{ 'type':'error', title: errorTitleNoti },2000);
                $('#form2009 .captcha-refresh').click(); }else{
                if(typeof(response) === 'string'){ response = JSON.parse(response); }
                if(response.status == 'SUCCESS'){ var alert = 'Cảm ơn bạn đã gửi thông tin cho chúng tôi'; VHV.alert(alert,{ type: 'success', title: successTitle, delay: 3000 });
                    VHV.App.modules[2009].itemId = response.id; if(response.localTransportCode){ VHV.App.modules[2009].localTransportCode = response.localTransportCode; }
                    VHV.App.modules[2009].declarationType = response.declarationType ? response.declarationType : ''; VHV.App.modules[2009].layout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.success"; VHV.App.modules[2009].lang = "vi"; VHV.App.modules[2009].fullName = $('#form2009 [name="fields[fullName]"]').val(); VHV.App.modules[2009].vehicleCode = $('#form2009 [name="fields[vehicleCode]"]').val(); VHV.App.modules[2009].startTime = $('#form2009 [name="fields[startTime]"]').val(); //this.saveLastForm();
                    setTimeout(function () { VHV.App.modules[2009].reload(); },1500);
                }else if(response.message) {
                    VHV.alert(response.message,{ type: 'error', title: errorTitleNoti, delay: 3000 });
                }
            }
            }
        },function() {
            if (navigator.geolocation) { var that = VHV.App.modules[2009]; navigator.geolocation.getCurrentPosition(function(position) { $.get('https://nominatim.openstreetmap.org/reverse?format=json&lon=' + position.coords.longitude + '&lat=' + position.coords.latitude, function(res){ if(res.address){ if (res.display_name) { that.$('[name="fields[address]"]').val(res.display_name); }
                var address = { };
                if (res.address.city) { address.provinceTitle = res.address.city; }
                if (res.address.county) { address.districtTitle = res.address.county; }
                if (res.address.suburb) { address.wardTitle = res.address.suburb; }
                VHV.Model('Content.Region.getRegionByTitle')({ 'address': JSON.stringify(address) }, function (response) {
                    if(typeof(response) === 'string'){ response = JSON.parse(response); }
                    if(response) { if(response.provinceId){ that.$('[name="fields[provinceId]"]').val(response.provinceId).change(); if(response.districtId){ VHV.ExecQueue.add(function() { that.$('[name="fields[districtId]"]').val(response.districtId).change(); setTimeout(function() { if (response.wardId) { VHV.ExecQueue.add(function () { setTimeout(function() { that.$('[name="fields[wardId]"]').val(response.wardId); }, 100);
                    }, function () {
                        return that.$('[name="fields[wardId]"] option').length > 2; });
                    }
                    }, 100);
                    }, function(){
                        return that.$('[name="fields[districtId]"] option').length > 2; });
                    }
                    }
                    }
                });
            }
            });
            });
            }
        });
        $('#module2009 input[name=id]').remove(); $('#form2009 [name="fields[healthinSuranceIdCard]"]').keyup(function(){ var str = $(this).val(); var newstr = str.trim(); $(this).val(newstr); });
        $('#form2009').on('change', '[name="fields[otherUser]"]', function () { if($(this).next().is(':checked')) { $('input[type="text"],input[type="number"]', '#form2009') .not(':button, :submit, :reset, :hidden') .val(''); $('input[type="radio"],input[type="checkbox"]', '#form2009').not('[name="fields[showCountryPassing]"], [name="fields[showSignal]"]') .prop('checked', false) .prop('selected', false); $('table input[value="2"]', '#form2009') .prop('checked', true); $('select', '#form2009').not('[name="fields[nation]"]').val('').change(); $('[name="fields[vehicle]"]').val('airplane'); $('#form2009 select[name="fields[vehicle]"]').change(); $(this).val(1).next().prop('checked', true); $('#form2009 .healthinSuranceIdCard-check').change(); }
        });
        $('#form2009').on('change', '[name="fields[vehicle]"]', function () { var value = $(this).val(); if(value && value == 'airplane'){ $('#form2009 .airplane2009').css('display','block'); $('#form2009 [name="fields[flightCode]"]').removeAttr('disabled'); }else{
            $('#form2009 .airplane2009').css('display','none'); $('#form2009 [name="fields[flightCode]"]').attr('disabled','disabled'); $('#form2009 [name="fields[flightCode]"]').val(''); $('#form2009 [name="fields[flightCode]"]').next().html(''); $('#form2009 [name="fields[vehicleCode]"]').val(''); $('#form2009 [name="fields[startProvinceId]"]').val(''); $('#form2009 [name="fields[endProvinceId]"]').val(''); $('#form2009 [name="fields[startGateId]"]').val(''); $('#form2009 [name="fields[endGateId]"]').val(''); }
            if(value && value == 'personal'){ $('.personal2009').css('display','block'); $('.other2009').css('display','none'); $('.personal2009 [name*="fields["]').removeAttr('disabled','disabled'); $('.other2009 [name*="fields["]').attr('disabled','disabled'); }else{
                $('.personal2009').css('display','none'); $('.other2009').css('display','block'); $('.personal2009 [name*="fields["]').attr('disabled','disabled'); $('.other2009 [name*="fields["]').removeAttr('disabled','disabled'); }
        });
        setTimeout(function(){ $('#form2009 select[name="fields[vehicle]"]').change(); }, 800);
        $('#form2009 [name="fields[countryPassing]"]').attr('disabled','disabled'); $('#form2009').on('change', '[name="fields[showCountryPassing]"]', function () { var value = $(this).val(); if(value && value == '0'){ $('#form2009 .showCountryPassing').css('display','none'); $('#form2009 [name="fields[countryPassing]"]').attr('disabled','disabled'); }else{
            $('#form2009 .showCountryPassing').css('display','block'); $('#form2009 [name="fields[countryPassing]"]').removeAttr('disabled','disabled'); }
        });
        $('#form2009 [name="fields[showSignalNote]"]').attr('disabled','disabled'); $('#form2009').on('change', '[name="fields[showSignal]"]', function () { var value = $(this).val(); if(value && value == '0'){ $('#form2009 .showSignal').css('display','none'); $('#form2009 [name="fields[showSignalNote]"]').attr('disabled','disabled'); }else{
            $('#form2009 .showSignal').css('display','block'); $('#form2009 [name="fields[showSignalNote]"]').removeAttr('disabled','disabled'); }
        });
        (function() { var data = localStorage.getItem('lastHMDecl'); if (data) { data = JSON.parse(data); }
            if (data) { setTimeout(function () { for (var i in data) { if (['fullName', 'passport', 'birthYear', 'seat', 'startGateId', 'deviceId', 'ip', 'lat', 'long', 'lang', 'endGateId', 'districtId', 'wardId'].indexOf(i) != -1 || i.indexOf('has') == 0) { continue; }
                var e = $('#module2009 [name="fields[' + i + ']"]'); if (e.length) { if (e[0].type == 'radio') { $('#module2009 [name="fields[' + i + ']"][value="' + data[i] + '"]').prop('checked', 'checked'); if (['optionIsolationBase'].indexOf(i) != -1) { e.change().click(); }
                } else if (e[0].type == 'checkbox') {
                    $('#module2009 [name="fields[' + i + ']"]').prop('checked', 'checked'); } else {
                    e.val(data[i]); if (['startProvinceId', 'provinceId', 'endProvinceId','vehicle'].indexOf(i) != -1) { e.change(); }
                }
                }
            }
            }, 300);
                if (data.startProvinceId || data.provinceId || data.endProvinceId) { setTimeout(function () { for (var i in { startGateId: 1, districtId: 1, endGateId: 1 }) {
                    if (data[i]) { $('#module2009 [name="fields[' + i + ']"]').val(data[i]).change(); }
                }
                    if (data.districtId) { setTimeout(function () { for (var i in { wardId: 1 }) {
                        if (data[i]) { $('#module2009 [name="fields[' + i + ']"]').val(data[i]); }
                    }
                    }, 3000);
                    }
                }, 3000);
                }
            }
        });
    </script></div> </div> </div></div><div class="hotline-footer9"> <ul> <li> <a href="tel:19009095"><img src="/upload/20823/Corona/hotline.png" alt=""><span>19009095</span></a> </li> </ul></div><style> .passenger-wrapper .alert-box { color: red; font-size: 14px; padding: 20px; }
.hotline-footer9 a{ color: white; display: inline-block; background: #F2651C; border-radius: 30px; padding-right: 10px; font-weight: bold; }
.hotline-footer9{ position: fixed; bottom:5px; left: 5px; z-index: 999; }
.hotline-footer9 .totalNewNotification{ position: relative; display: inline-block; }
.hotline-footer9 .totalNewNotification span{ position: absolute; top: 0; background: red; color: #fff; right: -5px; padding: 1px 5px; font-weight: bold; display: inline-block; border-radius: 999px; }
.hotline-box p { margin: 0; }
.hotline-box a { color: #015ab4; }
.download-app9{ position: fixed; bottom: 125px; right: 10px; background-color: #fff; border-radius: 999px; border: 1px solid #ccc; box-shadow: 0 0 5px rgba(0,0,0,0.4); padding: 5px; z-index: 1000; }
.download-app9 .btn-ch-play{ padding: 5px; }
#module9 .nav-tabs { text-align: center; display: -webkit-flex; display: flex; background-color: #eaeaea; }
#module9 .nav-tabs li{ float: none; display: inline-block; flex: 1; -webkit-flex: 1; }
#module9 .nav-tabs li>a{ margin-right: 0 !important; }
#module9{ padding-bottom: 100px; }
.passenger-wrapper .tab-login-home > a{ height: 62px; line-height: 42px; }
.passenger-wrapper .nav-tabs .tab-login-home a { background: #ff5f5f; color: #FFFFFF; border-color: #ff5f5f; }
.passenger-wrapper .nav-tabs .tab-login-home a:hover { background: #ff3e3e; color: #FFFFFF; border-color: #ff3e3e; }
@media (max-width: 768px) { .download-app9 { /*bottom: 5px;
 left: auto; right: 5px;*/
}
}
@media (max-width: 480px) { .hotline-footer9 a{ padding-right: 0; }
    .hotline-footer9 a span{ display: none; }
    .passenger-wrapper h1.text-center{ font-size: 28px; }
}
@media screen and (max-width: 992px) { .passenger-wrapper .tab-login-home{ display: none!important; }
}
.passenger-wrapper .box-edit-layout .form-group:not(.group-input-inline) .select2-container.select2-container--default{ /*width: auto !important;
 min-width: 240px;*/
}
@media(max-width: 768px){ .passenger-wrapper .box-edit-layout .form-group:not(.group-input-inline) .select2-container.select2-container--default{ min-width: 176px; }
}
@media (max-width: 768px) { .label-width.form-inline input.form-control { max-width: 100% !important; width: 100% !important; }
}
@media (max-width: 1024px) { .box-edit-layout{ overflow: hidden; }
}
.passenger-wrapper .nav-tabs li a { height: 100%; }
</style></div></div>  </div></div></div><style>/**/
</style>
</div></div> <div id="page-footer"></div></div><div class="region-bottom"><div id="module1" class="ModuleWrapper"><div class="table-bg-footer"><div id="column1-1" class="column1 container ">
    <div class="foverlay"></div>  <div class="columns-widget row">  <div class="col-md-12 col-xs-12 col-sm-12"><div id="module2" class="ModuleWrapper"></div><div id="module3" class="ModuleWrapper"><div class="footer"> <div class="row"> <div class="col-md-6 col-sm-6"> <p style="margin-top: 0;"><a style="color: white;" rel="noopener noreferrer" href="https://www.youtube.com/watch?v=uuBsNteM_60&amp;feature=youtu.be" target="_blank">Video hướng dẫn Khai báo y tế nhập cảnh</a></p> <p style="margin-top: 10px;"><a style="color: white;" rel="noopener noreferrer" href="https://www.youtube.com/watch?v=uIK04d8hrHs&amp;feature=youtu.be" target="_blank">Video hướng dẫn Khai báo y tế nội địa</a></p> <p style="margin-top: 10px;"><a style="color: white;" rel="noopener noreferrer" href="https://www.youtube.com/watch?v=36pOpha1Dts&amp;feature=youtu.be" target="_blank">Video hướng dẫn Khai báo y tế tại điểm kiểm soát dịch</a></p> </div> <div class="col-md-6 col-sm-6"> <div class="login-home-top"> <div> <p>Phần dành cho cán bộ quản lý</p> <ul class="login-home">   <li class="dropup" style="display: inline-block;min-width: 200px;"> <a id="dropdownMenuUser3" href="https://tokhaiyte.vn/?page=Account.home" title="Nhấn vào để vào trang cá nhân" class="username" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"><span>Chào bạn:</span>0979642710</a> <ul class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuUser3"> <li>       </li> <li><a href="javascript:VHV.Model('Member.User.logout')(false, function(){  location = 'https://tokhaiyte.vn/';  });void(0);" title=" Thành viên - Đăng xuất/Thoát" rel="nofollow">Đăng xuất</a></li>
</ul> </li>   </ul> <p style="margin-top: 10px;"><a style="color: white;" href="https://tokhaiyte.vn/?page=Project.TKYT.Guide.use" target="_blank">Hướng dẫn sử dụng</a></p> </div> </div> </div> </div></div><style> @media(max-width: 425px) { .footer { text-align: right; }
}
.item-logo3 a{ background-color: #fff; border-radius: 5px; display: block; padding: 5px; margin-bottom: 10px; }
.login-home-top { position: static; text-align: right; }
</style></div></div>  </div></div></div><style>/**/
</style>
</div></div>
<div id="footer-editer"></div>



<!--[if lt IE 9]>
<script src="/3rdparty/Bootstrap/js/ie8-responsive-file-warning.js"></script>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
<!--[if IE 6]>
<script src="/3rdparty/fix_ie/DD_belatedPNG.js"></script>
<script type="text/javascript">
    DD_belatedPNG.fix('.mask,img');
</script>
<![endif]-->

<script type="text/javascript">
    rootURL = location.protocol+'//'+location.host+'/';
    staticURL = '/';
</script>
<script type="text/javascript" src="/publish/js/lib2-1.521.min.js?669"></script>

<script type="text/javascript">
    if(window.vhvInit)
    {
        vhvInit();
    }
    $.extend(VHV,{
        pageId: "home",
        serverTime: 1646215628,
        domainRoot: '/',
        defaultCurrency: 'VNĐ',
        defaultNumberFormat: '',
        language: 'vi',
        version:'1.521',
        clientVersion:'669',
        pageVersion:'',
        ckeVersion:'4.15.0',
        loadingImage:'/App/images/loading.gif',
        site:'2001432',
        href:'?'+decode64('dGFiPTM='),
        defaultPortalPath:'',
        securityToken: '70cf5d3a23b632ff3da2fd126264ae053f1dd857b78ea29e55f7a6807ef59243',
        groupId: ''



        ,facebookAppId:"1166212453898229"


        ,chatServer:"https:\/\/chat.vhv.vn"


        ,currentAccountId: '5fe1801c92bd21ab1e7d2e34'
    });
    $.extend(VHV.App, {
        portal:'2001432',
        site:'2001432'
    });
    VHV.init();
    VHV.User = {
        id: '4940247'

    };
    ;
</script>
<script id="script62880">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62880'), {"type":"Form.Select","class":"form-control","name":"fields[startProvinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn n\u01a1i \u0111i"},"simple":"1","service":"Content.Region.selectProvinces","value":"","description":"-Ch\u1ecdn-","totalItems":63,"inputCount":62880,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62881">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62881'), {"type":"Form.Select","class":"form-control","name":"fields[startGateId]","service":"Project.TKYT.Gate.getStationList","data-x-cascade":"fields[vehicle]:filters[vehicle],fields[startProvinceId]:filters[provinceId]","simple":"1","filters":{"provinceId":"","vehicle":""},"description":"-Ch\u1ecdn-","value":"","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111i"},"inputCount":62881,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62882">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62882'), {"type":"Form.Select","class":"form-control","name":"fields[endProvinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn n\u01a1i \u0111\u1ebfn"},"simple":"1","service":"Content.Region.selectProvinces","value":"","description":"-Ch\u1ecdn-","totalItems":63,"inputCount":62882,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62883">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62883'), {"type":"Form.Select","class":"form-control","name":"fields[endGateId]","service":"Project.TKYT.Gate.getStationList","data-x-cascade":"fields[vehicle]:filters[vehicle],fields[endProvinceId]:filters[provinceId]","filters":{"provinceId":"","vehicle":""},"simple":"1","description":"-Ch\u1ecdn-","value":"","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111\u1ebfn"},"inputCount":62883,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62884">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62884'), {"type":"Form.Select","class":"form-control","name":"fields[startProvinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn n\u01a1i \u0111i"},"simple":"1","service":"Content.Region.selectProvinces","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":63,"inputCount":62884,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62885">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62885'), {"type":"Form.Select","class":"form-control","name":"fields[startDistrictId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111i(Qu\u1eadn huy\u1ec7n)"},"simple":"1","service":"Content.Region.selectDistricts","data-x-cascade":"fields[startProvinceId]:provinceId","provinceId":"","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":0,"inputCount":62885,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62886">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62886'), {"type":"Form.Select","class":"form-control","name":"fields[startWardId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111i(Ph\u01b0\u1eddng x\u00e3)"},"simple":"1","service":"Content.Region.selectWards","data-x-cascade":"fields[startDistrictId]:districtId","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":0,"inputCount":62886,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62887">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62887'), {"type":"Form.Select","class":"form-control","name":"fields[endProvinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn n\u01a1i \u0111\u1ebfn"},"simple":"1","service":"Content.Region.selectProvinces","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":63,"inputCount":62887,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62888">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62888'), {"type":"Form.Select","class":"form-control","name":"fields[endDistrictId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111\u1ebfn(Qu\u1eadn huy\u1ec7n)"},"simple":"1","service":"Content.Region.selectDistricts","data-x-cascade":"fields[endProvinceId]:provinceId","provinceId":"","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":0,"inputCount":62888,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62889">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62889'), {"type":"Form.Select","class":"form-control","name":"fields[endWardId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn \u0111i\u1ec3m \u0111\u1ebfn(Ph\u01b0\u1eddng x\u00e3)"},"simple":"1","service":"Content.Region.selectWards","data-x-cascade":"fields[endDistrictId]:districtId","value":"","description":"-Ch\u1ecdn-","disabled":"disabled","totalItems":0,"inputCount":62889,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62890">
    VHV.load('Common.Input.DatePicker', function(){
        (new VHV.Common.Input.DatePicker($('#input62890'), {"type":"Form.DatePicker","class":"form-control","name":"fields[startTime]","value":"02\/03\/2022","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn ng\u00e0y kh\u1edfi h\u00e0nh"},"inputCount":62890,"multiLanguage":false,"currency":"VND","mid":11,"moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62891"> VHV.load('Common.Input.Number', function(){ (new VHV.Common.Input.Number($('#input62891'), {"type":"Form.Number","class":"form-control","data-msg-required":"B\u1ea1n ch\u01b0a nh\u1eadp n\u0103m sinh","name":"fields[birthYear]","max":"2022","noSep":"1","value":"","inputCount":62891,"multiLanguage":false,"currency":"VND","mid":11,"moduleId":11})).draw(); });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62893">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62893'), {"type":"Form.Select","class":"form-control","name":"fields[nation]","service":"Content.Region.selectCountries","description":"Ch\u1ecdn","value":"5b0ec228e138230cb0072f82","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn qu\u1ed1c t\u1ecbch"},"style":"width: 100%","totalItems":199,"inputCount":62893,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62894">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62894'), {"type":"Form.Select","class":"form-control","name":"fields[provinceId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn t\u1ec9nh, th\u00e0nh"},"service":"Content.Region.selectProvinces","value":"","description":"Ch\u1ecdn","style":"width: 100%","totalItems":63,"inputCount":62894,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62895">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62895'), {"type":"Form.Select","class":"form-control","name":"fields[districtId]","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn qu\u1eadn, huy\u1ec7n"},"service":"Content.Region.selectDistricts","value":"","description":"Ch\u1ecdn","data-x-cascade":"fields[provinceId]:provinceId","style":"width: 100%","totalItems":0,"inputCount":62895,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62896">
    VHV.load('Common.Input.Select', function(){
        (new VHV.Common.Input.Select($('#input62896'), {"type":"Form.Select","class":"form-control","name":"fields[wardId]","description":"Ch\u1ecdn","msgs":{"required":"B\u1ea1n ch\u01b0a ch\u1ecdn ph\u01b0\u1eddng, x\u00e3"},"service":"Content.Region.selectWards","value":"","data-x-cascade":"fields[districtId]:districtId","style":"width: 100%","totalItems":0,"inputCount":62896,"multiLanguage":false,"currency":"VND","mid":11,"language":"vi","moduleId":11})).draw();
    });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62897"> VHV.load('Common.Input.TextArea', function(){ (new VHV.Common.Input.TextArea($('#input62897'), {"type":"Form.TextArea","class":"form-control","name":"fields[countryPassing]","height":"200px","value":"","inputCount":62897,"multiLanguage":false,"currency":"VND","mid":11,"richEditorType":"","richEditorToolbar":"","textLimitSize":"","moduleId":11})).draw(); });
</script>
<script type="text/javascript">
    ;
</script>
<script id="script62898"> VHV.load('Common.Input.TextArea', function(){ (new VHV.Common.Input.TextArea($('#input62898'), {"type":"Form.TextArea","class":"form-control","name":"fields[showSignalNote]","height":"200px","value":"","inputCount":62898,"multiLanguage":false,"currency":"VND","mid":11,"richEditorType":"","richEditorToolbar":"","textLimitSize":"","moduleId":11})).draw(); });
</script>
<script type="text/javascript">
    ;
    function removeSpaces(string) {
        return string.trim();
    }
    if($(window).outerWidth() < 414){
        $('.captcha-refresh img').attr('src', $('.captcha-refresh img').attr('src').replace('width=150','width=150'));
    }
    ;
    $('.backLink').on('click',function () { if(window.localStorage) { var backLink = localStorage.getItem('backLink'); if(backLink){ location = backLink; }else{
        history.back(); }
    }
    });
    $('#form11').on('change','[name="fields[flightCode]"]',function(){ if($(this).val()){ $('#form11 [name="fields[vehicleCode]"]').val($(this).val()); VHV.Model('Project.TKYT.Home.LocalTransport.getProvinceByFlightCode')({ 'code': $(this).val() }, function(response){
        if(typeof(response) === 'string') { response = JSON.parse(response); }
        if(response.startProvinceId) { $('#form11 [name="fields[startProvinceId]"]').val(response.startProvinceId).change(); }
        if(response.endProvinceId) { $('#form11 [name="fields[endProvinceId]"]').val(response.endProvinceId).change(); }
        setTimeout(function(){ if(response.startGateId) { $('#form11 [name="fields[startGateId]"]').val(response.startGateId); }else{
            $('#form11 [name="fields[startGateId]"]').val(''); }
            if(response.endGateId) { $('#form11 [name="fields[endGateId]"]').val(response.endGateId); }else{
                $('#form11 [name="fields[endGateId]"]').val(''); }
        },1000);
    });
        $('#form11 [name="fields[vehicleCode]"]').parent().parent().hide(); }else{
        $('#form11 [name="fields[vehicleCode]"]').val(''); $('#form11 [name="fields[vehicleCode]"]').parent().parent().show(); $('#form11 [name="fields[startProvinceId]"]').val(''); $('#form11 [name="fields[endProvinceId]"]').val(''); $('#form11 [name="fields[startGateId]"]').val(''); $('#form11 [name="fields[endGateId]"]').val(''); }
    });
    function removeSpaces(string) { return string.trim(); }
    var onSuccess = function(position) { $('#form11 [name="fields[lat]"]').val(position.coords.latitude); $('#form11 [name="fields[long]"]').val(position.coords.longitude); VHV.Model('Project.TKYT.MemberLocation.updateLocationInfo')({ code: '0979642710', deviceId: '', lat: position.coords.latitude, long: position.coords.longitude },function(response) {
    });
    };
    function onError(error) { $('#form11 [name="fields[lat]"]').val(''); $('#form11 [name="fields[long]"]').val(''); }
    navigator.geolocation.getCurrentPosition(onSuccess,onError); function setOptions(srcType) { var options = { // Some common settings are 20, 50, and 100
        quality: 10, destinationType: Camera.DestinationType.DATA_URL, // In this app, dynamically set the picture source, Camera or photo gallery
        sourceType: srcType, encodingType: Camera.EncodingType.JPEG, mediaType: Camera.MediaType.PICTURE, allowEdit: true, correctOrientation: true, //Corrects Android orientation quirks
        targetHeight: 1000, targetWidth: 1000 };
        return options; }
    function openCamera() { var srcType = Camera.PictureSourceType.CAMERA; var options = setOptions(srcType); //var func = createNewFileEntry;
        navigator.camera.getPicture(function cameraSuccess(imageData) { var src = "data:image/jpeg;base64," + imageData; displayImage(src); fillData(src); // You may choose to copy the picture, save it somewhere, or upload.
//createNewFileEntry(imageUri);
        }, function cameraError(error) {
            VHV.alert("Unable to obtain picture: " + error, "app"); }, options);
    }
    function openFilePicker() { var srcType = Camera.PictureSourceType.SAVEDPHOTOALBUM; var options = setOptions(srcType); //var func = createNewFileEntry;
        navigator.camera.getPicture(function cameraSuccess(imageData) { displayImage(imageData); }, function cameraError(error) {
            console.debug("Unable to obtain picture: " + error, "app"); }, options);
    }
    function displayImage(src) { $('#form11 #imageFile').attr('src',src).css('display','block'); }
    function fillData(src){ $('#form11 [name="fields[file]"]').val(src); VHV.Model('Project.TKYT.OCR.getInfoPassport')({ image: src }, function(response){
        if (typeof(response) == 'string') { response = JSON.parse(response); }
        if(response.fullName){ $('#form11 [name="fields[fullName]"]').val(response.fullName.toUpperCase()); }
        if(response.birthYear){ $('#form11 [name="fields[birthYear]"] option[value="'+response.birthYear+'"]').attr('selected','selected'); }
        if(response.gender){ $('#form11 [name="fields[gender]"] option[value="'+response.gender+'"]').attr('selected','selected'); }
        if(response.passport){ $('#form11 [name="fields[passport]"]').val(response.passport); }
        if(response.address){ $('#form11 [name="fields[address]"]').val(response.address); }
        if(response.id_check){ $('#form11 [name="fields[idCheck]"]').val(response.id_check); }
        if(response.id_logic){ $('#form11 [name="fields[idLogic]"]').val(response.id_logic); }
        if(response.id_type){ $('#form11 [name="fields[idType]"]').val(response.id_type); }
        if(response.idconf){ $('#form11 [name="fields[idconf]"]').val(response.idconf); }
    });
    }
    if(0 && navigator.camera){ $('#form11 [name="fields[fullName]"').parents('.row:first').prepend($('#camera11')); $('#camera11').show(); $('#openCamera').click(function() { openCamera(); });
        $('#openFilePicker').click(function() { openFilePicker(); });
    }
    setTimeout(function(){ if($('#form11 select[name="fields[provinceId]"]').val()){ $('#form11 select[name="fields[provinceId]"]').change(); }
    }, 1000);
    $('#form11 [name="fields[lang]"]').change(function(){ var langView = $(this).val(); switch (langView) { case 'lo': VHV.App.modules[11].langView = 'lo'; VHV.App.modules[11].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editLo"; break; case 'en': VHV.App.modules[11].langView = 'en'; VHV.App.modules[11].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editEn"; break; default: VHV.App.modules[11].langView = 'vi'; VHV.App.modules[11].detailLayout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.editVi"; break; }
        $('#module11 .form-resign2').css('opacity',0); VHV.App.modules[11].reload(); });
    $('#form11').on('change','.healthinSuranceIdCard-check', function () { if($(this).is(':checked')){ $('#form11 [name="fields[healthinSuranceIdCard]"]').attr('required',true); $(this).next().show(); }else{
        $('#form11 [name="fields[healthinSuranceIdCard]"]').val('').attr('required',false); $(this).next().hide(); }
    });
    var wrapper = $('.local-transport-wrap11'), inputs = wrapper.find('[name^="fields["]'); function transport11(isTransport){ if(wrapper && inputs) { if (isTransport) { inputs.each(function () { var newName = 'fields[' + $(this).attr('name') + ']'; $(this).attr('name', newName); });
        wrapper.show(); } else {
        inputs.each(function () { var newName = $(this).attr('name').replace('fields[', '').replace(']', ''); $(this).attr('name', newName); });
        wrapper.hide(); }
    }
    }
    var errorTitle = 'Lỗi'; errorTitle = 'Lỗi'; var errorTitleNoti = 'Có lỗi', successTitle = 'Thành công'; errorTitleNoti = 'Có lỗi'; successTitle = 'Thành công'; VHV.using ($.extend(
        $.parseJSON(decode64('eyJzZXJ2aWNlIjoiUHJvamVjdC5US1lULkhvbWUuTG9jYWxUcmFuc3BvcnQuc2VsZWN0SW5mbyIsImxheW91dCI6IlByb2plY3QuVEtZVC5Hcm91cC5IZWFsdGhSZWNvcmQuSGVhbHRoTW9uaXRvcmluZy5lZGl0Iiwic3VibWl0U2VydmljZSI6IlByb2plY3QuVEtZVC5Ib21lLkxvY2FsVHJhbnNwb3J0LnNlbmRSZXF1ZXN0IiwiaGFzQ2FwdGNoYSI6IjEiLCJoYXNMb2NhbFRyYW5zcG9ydCI6IjEiLCJ0YWIiOjMsIl9ub3RHZXRSZXF1ZXN0IjoxLCJpbmRleCI6MTF9')),{"module":"Content.Form","page":"home","id":"11","modulePosition":"1","moduleParentId":"9"}),{ notPlaceholder:true, filters: [], insuranceData: [], healthinSuranceIdCard: "", gender: "", provinceId: "", districtId: "", wardId: "", address: "", passport: "", phone: "0979642710", hasCaptcha: "1", hideHeader: false, itemId: "", lang: false, langView: false, healthId: "", hasLocalTransport: "1", errorBoxTitle: errorTitle, checkHealthInsurance: function() { var that = this; var form = $('#form' + that.id), service = 'Project.TKYT.API.HSSK.getPatientInfo', fullName = form.find('[name="fields[fullName]"]').val(), healthInsuranceNumber = form.find('[name="fields[healthinSuranceIdCard]"]').val(), birthYear = form.find('[name="fields[birthYear]"]').val(); VHV.Model(service)({ healthInsuranceNumber: healthInsuranceNumber, fullName: fullName, birthYear: birthYear, langView: "vi" }, function(response) {
            if(typeof(response) === 'string'){ response = JSON.parse(response); }
            if(response.status == 'SUCCESS') { delete response.status; VHV.App.modules[11].insuranceData = JSON.stringify(response); VHV.alert(response.message ? response.message : 'Lấy thông tin thẻ thành công', { 'delay': 3000, 'type': 'success' });
                VHV.App.modules[11].reload(); } else {
                VHV.alert(response.message ? response.message : 'Thao tác thất bại', { 'delay': 3000, 'type': 'error' });
            }
        });
        },
        rules:{ 'fields[fullName]': { required:true, maxlength: 255, },
            'fields[email]': { email:true, },
            'fields[passport]': { regex: /^[a-zA-Z0-9]*$/ },
            'fields[provinceId]': { required:true, },
            'fields[phone]': { required:true, phoneVN: true },
            'fields[birthYear]': { required:true, maxlength:4, minlength: 4, min: 1900, max: 2022 },
            'fields[gender]': { required:true, },
            'fields[nation]': { required:true, },
            'fields[address]': { required:true, },
            /*
            'fields[hasFever]': { required:true, },
            'fields[hasCough]': { required:true, },
            'fields[hasPneumonia]': { required:true, },
            'fields[hasBreath]': { required:true, },
            'fields[hasSoreThroat]': { required:true, },
            'fields[hasFatigue]': { required:true, },*/
            'fields[hasFromSickCountry]': { required:true, },
            'fields[hasPatient]': { required:true, },
            'fields[hasSick]': { required:true, },
            /*'fields[hasChronicLiver]': {
            required:true, },
            'fields[hasChronicBlood]': { required:true, },
            'fields[hasChronicLung]': { required:true, },
            'fields[hasChronicKidney]': { required:true, },
            'fields[hasHeartrelated]': { required:true, },
            'fields[hasHighBloodPressure]': { required:true, },
            'fields[hasHIV]': { required:true, },
            'fields[hasOrganTransplant]': { required:true, },
            'fields[hasDiabet]': { required:true, },
            'fields[hasCancer]': { required:true, },
            'fields[hasPregnant]': { required:true, },*/
            'fields[proviceId]': { required:true, },
            'fields[districtId]': { required:true, },
            'fields[wardId]': { required:true, },
            'fields[countryPassing]': { required:true, },
            'fields[showSignalNote]': { required:true, },
            'fields[healthinSuranceIdCard]':{ minlength: 8, maxlength: 17 },
            'fields[vehicle]':{ required:true, },
            'fields[startProvinceId]':{ required:true, },
            'fields[startDistrictId]':{ required:true, },
            'fields[startWardId]':{ required:true, },
            'fields[endProvinceId]':{ required:true, },
            'fields[endDistrictId]':{ required:true, },
            'fields[endWardId]':{ required:true, },
            'fields[startGateId]':{ required:true, },
            'fields[endGateId]':{ required:true, },
            'fields[vehicleCode]':{ required:true, },
            'fields[isLocalTransport]':{ required:true, },
            'fields[startTime]':{ required:true, dateVN: true, },
        },
        messages: { 'fields[startTime]':{ dateVN: "Ngày tháng không đúng định dạng dd/mm/YYYY hoặc không tồn tại", },
            'fields[fullName]':{ maxlength: "Họ tên không được vượt quá 225 ký tự", },
            'fields[passport]': { regex: "Số hộ chiếu hoặc CMND chỉ được nhập chữ không dấu và số", },
            'fields[birthYear]':{ maxlength: "Năm sinh nhập tối đa 4 ký tự số", minlength: "Năm sinh nhập tối thiểu 4 ký tự số", required: "Bạn chưa nhập năm sinh", min: "Vui lòng nhập giá trị lớn hơn hoặc bằng năm 1900", max: "Vui lòng nhập giá trị nhỏ hơn hoặc bằng năm "+2022 },
            'fields[gender]': { required: "Bạn chưa chọn giới tính", },
            'fields[countryPassing]':{ required: "Bạn chưa nhập những nơi đã đi qua trong vòng 14 ngày qua", },
            'fields[showSignalNote]':{ required: "Bạn chưa nhập các dấu hiệu", },
            'fields[phone]':{ phoneVN: "Số điện thoại không hợp lệ", number: "Số điện thoại chỉ được nhập giá trị là số" },
            'fields[companyId]':{ required: "Đơn vị công tác không được để trống" },
            'fields[vehicle]':{ required: "Bạn chưa chọn phương tiện đi lại", },
            'fields[healthinSuranceIdCard]':{ minlength: 'Số thẻ bảo hiểm y tế phải lớn hơn 8 và nhỏ hơn 17 kí tự', maxlength: 'Số thẻ bảo hiểm y tế phải lớn hơn 8 và nhỏ hơn 17 kí tự' },
        },
        saveLastForm: function(){ var data = { };
            this.$('[name^="fields["]').each(function(){ var name; if(/^fields\[(\w+)\]$/.test(this.name)){ name = RegExp.$1; }
            else{ return; }
                if(['fullName', 'passport', 'phone', 'email', 'seat', 'birthYear', 'deviceId','ip','lat','long','lang'].indexOf(name) != -1 || name.indexOf('has') == 0){ return; }
                var value = this.value; if(this.type == 'radio' || this.type == 'checkbox'){ if(!this.checked) return; }
                data[name] = value; });
            localStorage.setItem('lastHMDecl', JSON.stringify(data)); },
        success: function (response) { $('#module11 .captcha-refresh').click(); if(response == 'BotDetect'){ var alert = 'Mã bảo mật sai'; VHV.alert(alert,{ 'type':'error', title: errorTitleNoti },2000);
            $('#form11 .captcha-refresh').click(); }else{
            if(typeof(response) === 'string'){ response = JSON.parse(response); }
            if(response.status == 'SUCCESS'){ var alert = 'Cảm ơn bạn đã gửi thông tin cho chúng tôi'; VHV.alert(alert,{ type: 'success', title: successTitle, delay: 3000 });
                VHV.App.modules[11].itemId = response.id; if(response.localTransportCode){ VHV.App.modules[11].localTransportCode = response.localTransportCode; }
                VHV.App.modules[11].declarationType = response.declarationType ? response.declarationType : ''; VHV.App.modules[11].layout = "Project.TKYT.Group.HealthRecord.HealthMonitoring.success"; VHV.App.modules[11].lang = "vi"; VHV.App.modules[11].fullName = $('#form11 [name="fields[fullName]"]').val(); VHV.App.modules[11].vehicleCode = $('#form11 [name="fields[vehicleCode]"]').val(); VHV.App.modules[11].startTime = $('#form11 [name="fields[startTime]"]').val(); //this.saveLastForm();
                setTimeout(function () { VHV.App.modules[11].reload(); },1500);
            }else if(response.message) {
                VHV.alert(response.message,{ type: 'error', title: errorTitleNoti, delay: 3000 });
            }
        }
        }
    },function() {
        if (navigator.geolocation) { var that = VHV.App.modules[11]; navigator.geolocation.getCurrentPosition(function(position) { $.get('https://nominatim.openstreetmap.org/reverse?format=json&lon=' + position.coords.longitude + '&lat=' + position.coords.latitude, function(res){ if(res.address){ if (res.display_name) { that.$('[name="fields[address]"]').val(res.display_name); }
            var address = { };
            if (res.address.city) { address.provinceTitle = res.address.city; }
            if (res.address.county) { address.districtTitle = res.address.county; }
            if (res.address.suburb) { address.wardTitle = res.address.suburb; }
            VHV.Model('Content.Region.getRegionByTitle')({ 'address': JSON.stringify(address) }, function (response) {
                if(typeof(response) === 'string'){ response = JSON.parse(response); }
                if(response) { if(response.provinceId){ that.$('[name="fields[provinceId]"]').val(response.provinceId).change(); if(response.districtId){ VHV.ExecQueue.add(function() { that.$('[name="fields[districtId]"]').val(response.districtId).change(); setTimeout(function() { if (response.wardId) { VHV.ExecQueue.add(function () { setTimeout(function() { that.$('[name="fields[wardId]"]').val(response.wardId); }, 100);
                }, function () {
                    return that.$('[name="fields[wardId]"] option').length > 2; });
                }
                }, 100);
                }, function(){
                    return that.$('[name="fields[districtId]"] option').length > 2; });
                }
                }
                }
            });
        }
        });
        });
        }
    });
    $('#module11 input[name=id]').remove(); $('#form11 [name="fields[healthinSuranceIdCard]"]').keyup(function(){ var str = $(this).val(); var newstr = str.trim(); $(this).val(newstr); });
    $('#form11').on('change', '[name="fields[otherUser]"]', function () { if($(this).next().is(':checked')) { $('input[type="text"],input[type="number"]', '#form11') .not(':button, :submit, :reset, :hidden') .val(''); $('input[type="radio"],input[type="checkbox"]', '#form11').not('[name="fields[showCountryPassing]"], [name="fields[showSignal]"]') .prop('checked', false) .prop('selected', false); $('table input[value="2"]', '#form11') .prop('checked', true); $('select', '#form11').not('[name="fields[nation]"]').val('').change(); $('[name="fields[vehicle]"]').val('airplane'); $('#form11 select[name="fields[vehicle]"]').change(); $(this).val(1).next().prop('checked', true); $('#form11 .healthinSuranceIdCard-check').change(); }
    });
    $('#form11').on('change', '[name="fields[vehicle]"]', function () { var value = $(this).val(); if(value && value == 'airplane'){ $('#form11 .airplane11').css('display','block'); $('#form11 [name="fields[flightCode]"]').removeAttr('disabled'); }else{
        $('#form11 .airplane11').css('display','none'); $('#form11 [name="fields[flightCode]"]').attr('disabled','disabled'); $('#form11 [name="fields[flightCode]"]').val(''); $('#form11 [name="fields[flightCode]"]').next().html(''); $('#form11 [name="fields[vehicleCode]"]').val(''); $('#form11 [name="fields[startProvinceId]"]').val(''); $('#form11 [name="fields[endProvinceId]"]').val(''); $('#form11 [name="fields[startGateId]"]').val(''); $('#form11 [name="fields[endGateId]"]').val(''); }
        if(value && value == 'personal'){ $('.personal11').css('display','block'); $('.other11').css('display','none'); $('.personal11 [name*="fields["]').removeAttr('disabled','disabled'); $('.other11 [name*="fields["]').attr('disabled','disabled'); }else{
            $('.personal11').css('display','none'); $('.other11').css('display','block'); $('.personal11 [name*="fields["]').attr('disabled','disabled'); $('.other11 [name*="fields["]').removeAttr('disabled','disabled'); }
    });
    setTimeout(function(){ $('#form11 select[name="fields[vehicle]"]').change(); }, 800);
    $('#form11 [name="fields[countryPassing]"]').attr('disabled','disabled'); $('#form11').on('change', '[name="fields[showCountryPassing]"]', function () { var value = $(this).val(); if(value && value == '0'){ $('#form11 .showCountryPassing').css('display','none'); $('#form11 [name="fields[countryPassing]"]').attr('disabled','disabled'); }else{
        $('#form11 .showCountryPassing').css('display','block'); $('#form11 [name="fields[countryPassing]"]').removeAttr('disabled','disabled'); }
    });
    $('#form11 [name="fields[showSignalNote]"]').attr('disabled','disabled'); $('#form11').on('change', '[name="fields[showSignal]"]', function () { var value = $(this).val(); if(value && value == '0'){ $('#form11 .showSignal').css('display','none'); $('#form11 [name="fields[showSignalNote]"]').attr('disabled','disabled'); }else{
        $('#form11 .showSignal').css('display','block'); $('#form11 [name="fields[showSignalNote]"]').removeAttr('disabled','disabled'); }
    });
    (function() { var data = localStorage.getItem('lastHMDecl'); if (data) { data = JSON.parse(data); }
        if (data) { setTimeout(function () { for (var i in data) { if (['fullName', 'passport', 'birthYear', 'seat', 'startGateId', 'deviceId', 'ip', 'lat', 'long', 'lang', 'endGateId', 'districtId', 'wardId'].indexOf(i) != -1 || i.indexOf('has') == 0) { continue; }
            var e = $('#module11 [name="fields[' + i + ']"]'); if (e.length) { if (e[0].type == 'radio') { $('#module11 [name="fields[' + i + ']"][value="' + data[i] + '"]').prop('checked', 'checked'); if (['optionIsolationBase'].indexOf(i) != -1) { e.change().click(); }
            } else if (e[0].type == 'checkbox') {
                $('#module11 [name="fields[' + i + ']"]').prop('checked', 'checked'); } else {
                e.val(data[i]); if (['startProvinceId', 'provinceId', 'endProvinceId','vehicle'].indexOf(i) != -1) { e.change(); }
            }
            }
        }
        }, 300);
            if (data.startProvinceId || data.provinceId || data.endProvinceId) { setTimeout(function () { for (var i in { startGateId: 1, districtId: 1, endGateId: 1 }) {
                if (data[i]) { $('#module11 [name="fields[' + i + ']"]').val(data[i]).change(); }
            }
                if (data.districtId) { setTimeout(function () { for (var i in { wardId: 1 }) {
                    if (data[i]) { $('#module11 [name="fields[' + i + ']"]').val(data[i]); }
                }
                }, 3000);
                }
            }, 3000);
            }
        }
    });
    ;
    VHV.using ($.extend(
        $.parseJSON(decode64('eyJzZXJ2aWNlIjoiUHJvamVjdC5US1lULkhvbWUuUGFzc2VuZ2VyLnNlbGVjdCIsImxheW91dCI6IlByb2plY3QuVEtZVC5Hcm91cC5IZWFsdGhSZWNvcmQuUGFzc2VuZ2VyLndyYXBwZXIiLCJ3aWRnZXRDb2RlIjoiTXVsdGltZWRpYSIsIml0ZW1zUGVyUGFnZSI6IjIwIiwicGFnZU5vIjoiMSIsInR5cGVUaXRsZSI6IlRcdTFlZGQga2hhaSB5IHRcdTFlYmYiLCJzdWJtaXRTZXJ2aWNlIjoiUHJvamVjdC5US1lULkhvbWUuUGFzc2VuZ2VyLnNlbmRSZXF1ZXN0IiwicG9zaXRpb25Ub3AiOiIxIiwibWluaUZpbHRlcnMiOiIxIiwiaGlkZUV4cG9ydEV4Y2VsIjoiMSIsImhpZGVIaXN0b3J5TW9kdWxlIjoiMSIsImhpZGVDb21tZW50TW9kdWxlIjoiMSIsImhhc0NhcHRjaGEiOiIxIiwiZGlzYWJsZWQiOiIxIiwiaW5kZXgiOjIsInBhdGgiOiJDb250ZW50In0=')),{"module":"Content.Form","page":"home","id":"9","modulePosition":"0","moduleParentId":"6"}),{ hasLocalTransport: "", hideHeader: "", hasCaptcha: "1", itemId: "", lang: "", langView: "", healthId: "", });
    $('#wrapper9 .nav-tabs > li > a').on('click', function(){ var tab = $(this).data('case'); switch (tab) { case 'HDPassenger': $('#loadModuleContent9').loadModule('Content.Form', { layout: 'Project.TKYT.Group.HealthRecord.Passenger.edit', submitService: 'Project.TKYT.Home.Passenger.sendRequest', service: 'Project.TKYT.Home.Passenger.select', hasCaptcha: 1, hideHeader: 1, tab: 1, lang: "", langView: "", itemId: "", code: "", passport: "", healthId: "", gateId: "", });
        break; case 'HDHealth': $('#loadModuleContent9').loadModule('Content.Form', { layout: 'Project.TKYT.Group.HealthRecord.HealthMonitoring.edit', submitService: 'Project.TKYT.Home.Health.edit', service: 'Project.TKYT.Home.Health.selectInfo', hasCaptcha: 1, tab: 2, hideHeader: 1, itemId: "", healthId: "", });
        break; default: $('#loadModuleContent9').loadModule('Content.Form', { layout: 'Project.TKYT.Group.HealthRecord.HealthMonitoring.edit', submitService: 'Project.TKYT.Home.LocalTransport.sendRequest', service: 'Project.TKYT.Home.LocalTransport.selectInfo', hasCaptcha: 1, hasLocalTransport: 1, hideHeader: 1, tab: 3, itemId: "", healthId: "", });
        break; }
    });
    $('#wrapper9 .nav-tabs > li > a[href="#tab-9-3"]').click(); ;
    VHV.using ($.extend(
        $.parseJSON(decode64('eyJsYXlvdXQiOiJQcm9qZWN0LlRLWVQubG9naW5Gb290ZXIiLCJpdGVtc1BlclBhZ2UiOjgsInBhZ2VObyI6MSwid2lkZ2V0Q29kZSI6Ik11bHRpbWVkaWEiLCJ0b3RhbEl0ZW1zIjowLCJodG1sQ29kZSI6IjxwPmxvZ2luLWZvb3RlcjxcL3A+IiwiaW5oZXJpdFBhZ2VJZCI6ImJhc2VXZWIiLCJpbmRleCI6MSwicGF0aCI6IkNvbnRlbnQifQ==')),{"module":"Content.Listing","page":"home","id":"3","modulePosition":"1","moduleParentId":"1"}));







</script>



<!--[if lt IE 9]>
<link type="text/css" rel="stylesheet" href="/3rdparty/Bootstrap/dist/css/bootstrap-ie7.css?v=1.521"/>
<![endif]-->

<div id="loader" style="position: fixed; top: 1em; left: 1em; z-index: 10000; display: none;"><img src="/App/images/loading.gif" alt="loading..." width="50" height="50"></div><style>.note-icon-date {display: inline-block;position: absolute;right: 10px;bottom: 10px;color: #999;}.form-group{position: relative;}.ui-datepicker select.ui-datepicker-month, .ui-datepicker select.ui-datepicker-year {width: auto !important;}</style><style>
    .CodeMirror {
        border: 1px solid #ccc;
        margin-bottom: 6px;
        background: white;
    }
    .CodeMirror-scroll {
        min-height: 200px;
        max-height: 100%;
        height: auto;
        overflow-y: hidden;
        overflow-x: auto;
        width: 100%
    }

</style><div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div></body></html>
