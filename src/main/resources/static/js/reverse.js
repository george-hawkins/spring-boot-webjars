// TODO: why does echo use our nice SockJS while reverse depends on browser web socket support (and the updateTarget() logic)?
function createWebSocket(target) {
    return new WebSocket(target);
}

function updateTarget() {
    var scheme = (window.location.protocol == 'http:') ? 'ws://' : 'wss://';

    document.getElementById('target').value = scheme + window.location.host + document.getElementById('target').value;
}
