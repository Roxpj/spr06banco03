# imagen base para crea la nuestra
from ubuntu_jdk17

# copia el war en la imagen
copy target/z25mdp-spr-vista-sdata-mvc-1.jar z25mdp-spr-vista-sdata-mvc-1.jar

# lo que se ejecutará al ejecutar el contenedor
entrypoint ["java", "-jar", "/z25mdp-spr-vista-sdata-mvc-1.jar"]

# expone el puerto 7070 del contenedor
expose 7070