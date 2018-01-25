var firstH1;

window.addEventListener("load", _=>{
	firstH1 = document.getElementByTagName("h1")[0];
	window.addEventListener("mouseMove", (X,Y)=>{
		firstH1.innerText = "Mouse is at: "+X+"/"+Y;
	});
	window.addEventListener("keydown", _=>{
		documnet.style.backgroundColor="#0f0";
	});
	document.style.backgroundColor="#fff";
})
