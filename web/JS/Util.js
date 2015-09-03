/**
 * Redirecciona a la pagina que se recibe como parametro
 * @param pagina
 */
function redireccionar(pagina) {

    window.location = pagina;
}
function ajaxFunction() {
    var xmlHttp;
    try {
        // Firefox, Opera 8.0+, Safari
        xmlHttp = new XMLHttpRequest();
        return xmlHttp;
    }
    catch (e) {
        // Internet Explorer
        try {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            return xmlHttp;
        }
        catch (e) {
            try {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                return xmlHttp;
            }
            catch (e) {
                alert("Your browser does not support AJAX!");
                return false;
            }
        }
    }
}

function cargarSelect(jspName, nextSelectName, currentSelectElem) {
    var ajax = new ajaxFunction();

    var seleccionado = currentSelectElem.options[currentSelectElem.selectedIndex].value;

    ajax.onreadystatechange = function () {
        if (ajax.readyState == 4) {
            var options = ajax.responseText;
            document.getElementById(nextSelectName).innerHTML = options;
        }

    }
    ajax.open("POST", jspName, true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send("selected=" + seleccionado);


}

function resetSelectWhitText(innerSelect, tEXT) {
    if (innerSelect.options[0].text != tEXT) {
        addOption(innerSelect, null, tEXT, false);
    }
    innerSelect.selectedIndex = 0;
}
function cargarListaDeUsuarios(idDiv){
    var ajax = new ajaxFunction();
    ajax.onreadystatechange = function () {
        if (ajax.readyState == 4) {
            var div = document.getElementById(idDiv);
            div.innerHTML = ajax.responseText;
        }

    };
    ajax.open("POST", 'ListaDeUsuarios.action', true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send();
}
