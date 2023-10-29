docker build -t hosuk/project-k-apiserver .
<br>
docker run -it -p 8080:80 --rm --name front hosuk/project-k-front