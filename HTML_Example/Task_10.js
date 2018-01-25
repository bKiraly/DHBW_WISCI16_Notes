window.addEventListener("load", _=>{
	firstH1 = document.getElementById("sajt");
	window.addEventListener("mousemove", (e)=>{
		firstH1.innerText = "Mouse is at: "+e.x+"/"+e.y;
	});
	window.addEventListener("keydown", _=>{
		document.body.style.backgroundColor="#0f0";
	});
	document.body.style.backgroundColor="#fff";
})
