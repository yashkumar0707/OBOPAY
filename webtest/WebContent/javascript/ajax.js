/**
 * 
 */
var req= new XMLHttpRequest();
req.open('GET','https://www.youtube.com/redirect?redir_token=T-Ofbk0o2ymeyYXIUlGeM2mOAaZ8MTU2MDI0NzgzMEAxNTYwMTYxNDMw&q=https%3A%2F%2Flearnwebcode.github.io%2Fjson-example%2Fanimals-1.json&v=rJesac0_Ftw&event=video_description');
req.onload= function(){
	console.log(req.responsetext);
	
};
req.send();
