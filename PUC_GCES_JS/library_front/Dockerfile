# Use uma imagem base com o Node.js instalado
FROM node:latest

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo package.json e o arquivo package-lock.json (se existir)
COPY package*.json ./

# Execute o comando npm install para instalar as dependências da aplicação
RUN npm install

# Copie todo o código fonte da aplicação para o diretório de trabalho
COPY . .

# Defina a porta em que a aplicação irá escutar
EXPOSE 3000

# Comando para iniciar a aplicação quando o contêiner for iniciado
CMD ["npm", "start"]
