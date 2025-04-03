# Define a imagem base
FROM nginx

# Remove o arquivo de configuração padrão do Nginx
RUN rm /etc/nginx/conf.d/default.conf

# Copia o arquivo de configuração personalizado para o diretório correto no contêiner
COPY nginx.conf /etc/nginx/conf.d/

# Copia a aplicação para o diretório raiz do servidor Nginx
COPY /library_front/ .

# Define a porta em que o contêiner Nginx será exposto
EXPOSE 8080

# Comando para iniciar o servidor Nginx
CMD ["nginx", "-g", "daemon off;"]