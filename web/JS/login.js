/**
 * Created by Martin Alejandro Melo on 28/08/15.
 */

function highlight() {
    document.getElementById('boton').setAttribute('class', 'btn btn-success');
}

function cambiarImagen(){
    var divEle = document.getElementById('imagen');
    var usuario = document.getElementById('userName').value;
    divEle.innerHTML = '<img class="profile-img" id="imagenPerfil" onerror="ImgError(this)" src="Images/usuarios/'+ usuario +'.jpg" alt="">'
}
function ImgError(source){
    source.src = "Images/usuarios/default.jpg";
    source.onerror = "";
    return true;
}
