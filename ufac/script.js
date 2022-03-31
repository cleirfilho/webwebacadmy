window.onload = () => {
   

   let botoes = document.querySelectorAll("button.excluir")
   botoes.forEach(item =>  {

    item.addEventListener('click', () => {
        item.parentNode.parentNode.parentNode.remove();
    })
   });
   let alertas = document.querySelectorAll("div.alerta span")
   alertas.forEach(item =>{
     item.addEventListener('click', () => {

        item.parentNode.style.display = "none";
     })

   });

   let btn_carregar = document.querySelector("button#carregar_dados")
   let tabela = document.querySelector("table")
    const xhr = new XMLHttpRequest();
    if(btn_carregar){
        btn_carregar.addEventListener("click", () => {
        let url = "https://raw.githubusercontent.com/danielnsilva/webacademyufac/main/usuarios.json"
        fetch(url)
        .then(response => response.json())
        .then(dados => {
            for (let item in dados){

                let linha = document.createElement("tr")
                let id = document.createElement("td")
                let nome = document.createElement("td")
                let usuarios = document.createElement("td")
                let ativo = document.createElement("td")
                let papel = document.createElement("td")
                let acoes = document.createElement("td")
                id.classList.add("fit");
                nome.textContent = dados[item].nomeCompleto
                usuarios.textContent = dados[item].nomeUsuario
                ativo.textContent = dados[item].ativo
                papel.textContent = dados[item].papel
                acoes.innerHTML = "<button type='button'>Editar</button>"+"<button type='button' class='excluir'>Excluir</button>"
               
                linha.appendChild(id)
                linha.appendChild(nome)
                linha.appendChild(usuarios)
                linha.appendChild(ativo)
                linha.appendChild(papel)
                linha.appendChild(acoes)
                tabela.tBodies[0].appendChild(linha)



            }
        })
       
    })
    }

   }