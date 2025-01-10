```
docker run -d \
-p 9090:9090 \
-v $(pwd)/config/prometheus.yml:/etc/prometheus/prometheus.yml \
-v $(pwd)/data:/prometheus \
--name prometheus \
prom/prometheus
```
