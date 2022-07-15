FROM node:latest
RUN npm install -g @comunica/query-sparql
EXPOSE 3000
CMD ["comunica-sparql-http", "http://web:8080/data/data.ttl"]