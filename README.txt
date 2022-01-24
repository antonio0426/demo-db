
docker buildx create --name demobuilder --driver-opt env.BUILDKIT_STEP_LOG_MAX_SIZE=10485760
docker buildx --builder demobuilder build -t demo-db-image . (creo l'immagine a partire dal Dockerfile)
docker images (per visualizzare l'immagine appena creata)
docker run --name demo-db-container -p 8081:8080 demo-db-image -d (eseguo l'immagine)
docker ps -a per vedere il container (istanza della immagine) in esecuzione o eseguite in precedenza

L'immagine è un template mentre il container è l'istanza di una immagine che gira su un host