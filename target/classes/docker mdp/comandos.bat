docker build -t mediosdepago:1.0 .

docker run -d --name mdp -p 7070:7070 mediosdepago:1.0

