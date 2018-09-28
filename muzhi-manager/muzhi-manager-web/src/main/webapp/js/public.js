var imgFile = new ImgUploadeFiles('.box',function(e){
    this.init({
        MAX : 3, //限制个数
        MH : 5800, //像素限制高度
        MW : 5900, //像素限制宽度
        callback : function(arr){
            console.log(arr)
        }
    });
});