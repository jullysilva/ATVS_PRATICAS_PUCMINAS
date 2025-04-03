# Use uma imagem base do PostgreSQL
FROM python:latest

WORKDIR /app

# Copie o restante do código-fonte do projeto
COPY . .

# Variáveis de ambiente para personalizar a criação do banco de dados
ENV POSTGRES_USER=${POSTGRES_USER}
ENV POSTGRES_PASSWORD=${POSTGRES_PASSWORD}
ENV POSTGRES_DB=${POSTGRES_DB}
ENV POSTGRES_PORT=${POSTGRES_PORT}
ENV POSTGRES_HOST=${POSTGRES_HOST}

RUN pip install -r requirements.txt


# Expõe a porta que o servidor web do Django vai usar
EXPOSE 8000
# Execute os comandos de inicialização, como migrações de banco de dados
CMD python manage.py makemigrations ; python manage.py migrate ; python manage.py runserver 0.0.0.0:8000


