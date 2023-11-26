# docker-app-sample
Docker Environment-Based Applications

<p>
도커컴포즈 실행
<br>
docker-compose -f docker-compose.yml up -d
</p>
<p>
특정이미지만 재실행
<br>
docker-compose restart front
</p>
<p>
Docker Image Build
</p>
<ul>
<li>
    [api-server]<br>
    <ul>
        <li>api-server/gradlew clean build -p api-server</li>
        <li>docker rmi hosuk/project-k-apiserver</li>
        <li>docker build -t hosuk/project-k-apiserver api-server</li>
    </ul>
</li>
<li>
    [dm-party-reference-data-direcotry]<br>
    <ul>
        <li>dm-party-reference-data-direcotry/gradlew clean build -p dm-party-reference-data-direcotry</li>
        <li>docker rmi hosuk/project-k-dm-party-reference-data-direcotry</li>
        <li>docker build -t hosuk/project-k-dm-party-reference-data-direcotry dm-party-reference-data-direcotry</li>
    </ul>
</li>
<li>
    [dm-savings-account]<br>
    <ul>
        <li>docker rmi hosuk/project-k-dm-savings-account</li>
        <li>docker build -t hosuk/project-k-dm-savings-account dm-savings-account</li>
    </ul>
</li>
<li>
    [front]<br>
    <ul>
        <li>docker rmi hosuk/project-k-front</li>
        <li>docker build -t hosuk/project-k-front front</li>
    </ul>
</li>
</ul>