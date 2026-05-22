publico clase libro{

    //atributo
    privado Cadena título;
    privado Cadena autor;
    privado entero numeropaginas;
    privado final Cadena ISBN;
    privado estático entero contadorlibros=0;

    //constructor por defecto//
    público libro() {

        este.título="desconocido";
        este.autor="desconocido";
        este.numeropaginas=0;
        este.ISBN="000-0000000000";
        contadorlibros++;
    }

    //constructor parametriado//
    público libro(Cadena título,Cadena autor,entero numeropaginas,Cadena ISBN){

        este.título=titulo;
        este.autor=autor;
        este.numeropaginas=numeropaginas;

        este.ISBN=ISBN;//atributo final se inicializa aqui//
        contadorlibros++;
    }

    público Cadena obtenerTitulo() {  
      devolver titulo;
    }
  publico vacío conjunto de páginas(entero páginas) {
    este.numeropaginas=páginas;
}

público entero obtenernumeropáginas(){

    devolver este.numeropaginas;
}

público vacío MostrarInfo() {

    Sistema.afuera.imprimir("'" +título+"'" por "+autor+" ( "+numeropaginas+" páginas). ISBN: "+ISBN);
}

público estático entero obtenerLibrosTotales() {

    devolver contadorlibros;
}
}

