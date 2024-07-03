
var projectName = '教学辅助平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课程信息',
	url: './pages/kechengxinxi/list.html'
}, 
{
	name: '课程作业',
	url: './pages/kechengzuoye/list.html'
}, 

{
	name: '交流论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '校园公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot59b1w/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","删除"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科目分类","menuJump":"列表","tableName":"kemufenlei"}],"menu":"科目分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级分类","menuJump":"列表","tableName":"banjifenlei"}],"menu":"班级分类管理"},{"child":[{"buttons":["查看","删除"],"menu":"课程作业","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业管理"},{"child":[{"buttons":["查看","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"校园公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看"],"menu":"作业批改","menuJump":"列表","tableName":"zuoyepigai"}],"menu":"作业批改管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","布置作业"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程作业","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业管理"},{"child":[{"buttons":["查看","删除","审核","批改"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业批改","menuJump":"列表","tableName":"zuoyepigai"}],"menu":"作业批改管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
