const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot59b1w/",
            name: "springboot59b1w",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot59b1w/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教学辅助平台"
        } 
    }
}
export default base
