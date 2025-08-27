class Main {
    public static void main(String[] args) {
        String[] usuarios = {"1234", "5678"};
        String[] nombres = {"Juan", "Maria"};
        int intentos = 0;
        int usuarioActual = -1;
        int opcion = 0;
        double[] saldos = {1000.0, 2500.0};
        boolean salir = false;
        selecUsuario su = new selecUsuario();
        operacion op = new operacion();
        su.mostUsuario(usuarios,nombres,intentos,usuarioActual);
        op.operaciones(su.mostUsuario(usuarios,nombres,intentos,usuarioActual),saldos,salir,opcion);
        }
    }
