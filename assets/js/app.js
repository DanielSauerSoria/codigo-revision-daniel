const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name');//agregue . a name para referirnos a la clase
const $b = document.querySelector('.blog');//cambie # por . porque no es un id
const $l = document.querySelector('.location');

async function displayUser(username) {//agregue el async para poder usar el await
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  const data = await response.json();//faltaba convertirlo a json
  console.log(data);
  $n.textContent = `${data.name}`;//cambie las comillas simples por backticks
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);