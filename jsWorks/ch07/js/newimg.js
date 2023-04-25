function addContents(){
    let newP = document.createElement("p");
    let text = document.createTextNode("은은하고 다채로운 꽃향");
    newP.appendChild(text); // <p>은은하고 다채로운 꽃향</p>

    // div태그 안에 p태그 포함
    document.querySelector("#info").appendChild(newP);

    // <img 태그>
    let newImg = document.createElement("img");

    // src 속성
    let src = document.createAttribute("src");
    src.value = "./images/coffee-gray.jpg";
    newImg.setAttributeNode(src);

    // alt 속성
    let alt = document.createAttribute("alt");
    alt.value = "커피 이미지";
    newImg.setAttributeNode(alt);

    // div태그 안에 img태그 포함
    document.querySelector("#info").appendChild(newImg);

    document.querySelector("a").style.textDecoration = "none";
    document.querySelector("a").style.color = "blue";
}