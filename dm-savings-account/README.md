docker build -t hosuk/project-k-dm-savings-account .
<br>
docker run -it -p 8080:8080 --rm --name dm-savings-account hosuk/project-k-dm-savings-account