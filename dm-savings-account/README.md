docker build -t hosuk/project-k-dm-savings-account .
<br>
docker run -it -p 8080:80 --rm --name front hosuk/project-k-dm-savings-account