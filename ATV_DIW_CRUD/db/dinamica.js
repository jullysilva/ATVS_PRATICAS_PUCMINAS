//lida no localstrorage
var db = JSON.parse(localStorage.getItem('animes'));
//confere
if (!db) {
    db = dados.results;
    localStorage.setItem('animes', JSON.stringify(db))
}
//preencher tabela no index
function preencherTabela() {
    localStorage.setItem('indice', "");
    var tabela = document.getElementById("tab");
    var cont = `<tr>
    <th>Anime</th>
    <th>Gênero</th>
    <th>Temporadas</th>
    <th>Protagonista</th>
    <th id="l">Alteração</th>
  </tr>`;

    for (i = 0; i < db.length; i++) {
    cont = cont + `<tr>
        <td class="cursor">${db[i].nome}</td>
        <td>${db[i].genero}</td>
        <td>${db[i].temporadas}</td>
        <td>${db[i].personagem}</td>
        <td><a><button class="btn btn-warning" onclick="alterar(${i})">Alterar</button></a>    |     <a><button class="btn btn-danger" onclick="excluir(${i})">Excluir</button></a> | <button class="btn btn-info" data-toggle="modal" data-target="#visualizar" onclick="preencheModal(${i})">Ver mais</button></td>
        </tr>`;
    }

    tabela.innerHTML = cont;
}



//visaulizar informaçoes
function preencheModal(indice){
    document.getElementById('demo').innerHTML = db[indice].nome;
    document.getElementById('demo1').innerHTML = db[indice].genero;
    document.getElementById('demo2').innerHTML = db[indice].temporadas;
    document.getElementById('demo3').innerHTML = db[indice].personagem;
    document.getElementById('demo4').innerHTML = db[indice].publico;
    document.getElementById('demo5').src = db[indice].imagem;
    document.getElementById('demo6').innerHTML = db[indice].sinopse;
}

//carrregar pagina de adiciona sem caixa de textos preenchidas
function adicionar(){
    location = "registroalternativo.html";
    sessionStorage.removeItem('indice');
}

//conta para saber qual a string é pra mexer
function alterar(id) {
    location = "registroalternativo.html";
    sessionStorage.setItem('indice', id);
}

//alterar objetos salvos no json 
function alt(){
    var i = sessionStorage.getItem('indice'); 
    if(i != "" && i !== null && i != undefined) { 
        document.getElementById('anime').value = db[i].nome;
        document.getElementById('genero').value = db[i].genero;
        document.getElementById('temporada').value = db[i].temporadas;
        document.getElementById('persprincipal').value = db[i].personagem;
        document.getElementById('publico').value = db[i].publico;
        document.getElementById('sinopse').value = db[i].sinopse;
        document.getElementById('output').src = db[i].imagem;
    }
}
//salvar informacoes alteraçao ou criadas
function salvar(){
    i = sessionStorage.getItem('indice');
    if(i != "" && i != null && i != undefined){ //Salvar o que foi alterado
        db[i].nome = document.getElementById('anime').value;
        db[i].genero = document.getElementById('genero').value;
        db[i].temporadas = document.getElementById('temporada').value;
        db[i].personagem = document.getElementById('persprincipal').value;
        db[i].publico = document.getElementById('publico').value;
        db[i].sinopse = document.getElementById('sinopse').value;
        db[i].imagem = document.getElementById('output').src;
        localStorage.setItem("animes", JSON.stringify(db));
    }
    else //SALVAR CRIAÇAO
    {
      var atualizacaoAnime  = {
        nome : document.getElementById('anime').value,
        genero : document.getElementById('genero').value,
        temporadas : document.getElementById('temporada').value,
        personagem : document.getElementById('persprincipal').value,
        publico : document.getElementById('publico').value,
        sinopse : document.getElementById('sinopse').value,
        imagem : document.getElementById('output').src

      }        
      db.push(atualizacaoAnime);
      localStorage.setItem("animes", JSON.stringify(db));
    }   
    alert("As informações foram salvas!\n Volte a página incial"); 
}
//excluir informaçoes
function excluir(id) {
    db.splice(id, 1);
    localStorage.setItem('animes', JSON.stringify(db));
    window.location.reload();
}
//Recebe imagem de arquivo externo e salva
var openFile = function(event) {
    var input = event.target;

    var reader = new FileReader();
    reader.onload = function(){
      var dataURL = reader.result;
      var output = document.getElementById('output');
      output.src = dataURL;
    };
    reader.readAsDataURL(input.files[0]);
   
  };



