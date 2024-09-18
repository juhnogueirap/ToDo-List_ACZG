document.getElementById("criarButton").onclick = function () {
    const modal = new bootstrap.Modal(document.getElementById('modalCriarTarefa'));
    modal.show(modal);
};
document.getElementById("visualizarButton").onclick = function () {
    const modal = new bootstrap.Modal(document.getElementById('modalVisualizarTarefas'));
    modal.show(modal);
};
document.getElementById("editarButton").onclick = function () {
    const modal = new bootstrap.Modal(document.getElementById('modalSelecionarTarefa'));
    modal.show(modal);
};

function atualizarValorPrioridade(valor) {
    document.getElementById('valorPrioridade').textContent = valor;
}

function atualizarValorFiltroPrioridade(valor) {
    document.getElementById('valorFiltroPrioridade').textContent = valor;
}
function verificarCampoVazio(input) {
    if (input.value === '') {
        input.type = 'text';
        input.placeholder = 'Sem Filtro';
    }
}


