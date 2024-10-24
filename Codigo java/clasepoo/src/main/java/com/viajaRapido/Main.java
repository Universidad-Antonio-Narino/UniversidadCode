public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        // Obtener la fecha del sistema
        Date todayDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fechaEjecucion = sdf.format(todayDate);

        Empresa empresa = new Empresa();
        empresa.setNombre("Rapido Fly");
        empresa.setNit(900800);
        empresa.setTelefono(320123);

        Ciudad[] ciudades = new Ciudad[6];
        ciudades[0] = new Ciudad();
        ciudades[0].setNombre("Bogota");

        ciudades[1] = new Ciudad();
        ciudades[1].setNombre("Cali");

        ciudades[2] = new Ciudad();
        ciudades[2].setNombre("Medellin");

        ciudades[3] = new Ciudad();
        ciudades[3].setNombre("Cartagena");

        ciudades[4] = new Ciudad();
        ciudades[4].setNombre("Tunja");

        ciudades[5] = new Ciudad();
        ciudades[5].setNombre("Pasto");

        Bus busUno = new Bus();
        busUno.setPlaca("qaz123");
        busUno.setSillas(12);

        Bus busDos = new Bus();
        busDos.setPlaca("qwe123");
        busDos.setSillas(30);

        Ruta rutaNorte = new Ruta();
        rutaNorte.setCodRuta(100);
        rutaNorte.setNombreRuta("Ruta Norte");
        rutaNorte.setOrigen(ciudades[0].getNombre());
        rutaNorte.setDestino(ciudades[2].getNombre());
        rutaNorte.setPrecio(120_000);
        rutaNorte.setDuracion(10);

        Ruta rutaSur = new Ruta();
        rutaSur.setCodRuta(200);
        rutaSur.setNombreRuta("Ruta Sur");
        rutaSur.setOrigen(ciudades[0].getNombre());
        rutaSur.setDestino(ciudades[5].getNombre());
        rutaSur.setPrecio(220_000);
        rutaSur.setDuracion(18);

        Ruta rutaCosta = new Ruta();
        rutaCosta.setCodRuta(300);
        rutaCosta.setNombreRuta("Costa caribe");
        rutaCosta.setOrigen(ciudades[0].getNombre());
        rutaCosta.setDestino(ciudades[3].getNombre());
        rutaCosta.setPrecio(180_000);
        rutaCosta.setDuracion(14);

        Cliente clienteUno = new Cliente();
        System.out.println("Ingrese nombre del cliente: ");
        clienteUno.setNombre(sc.nextLine());

        // =========================================
        // ======  CREACION DEL TICKET  ============
        Date fechaUno = new Date();
        String fecVentaUno = sdf.format(fechaUno);
        Ticket ticketUno = new Ticket();
        ticketUno.setBus(busUno);
        ticketUno.setId(1);
        ticketUno.setFecha(fecVentaUno);
        ticketUno.setRuta(rutaSur);
        ticketUno.setCliente(cliente);

        Ticket ticketDos = new Ticket();
        ticketDos.setBus(busUno);
        ticketDos.setId(2);
        ticketDos.setRuta(rutaNorte);

        Cliente clienteDos = new Cliente();
        System.out.println("Ingrese nombre del cliente Dos: ");
        clienteDos.setNombre(sc.nextLine());
        Date fechaDos = new Date();
        String fecVentaDos = sdf.format(fechaDos);

        ticketDos.setFecha(fecVentaDos);
        ticketDos.setCliente(clienteDos);

        Ticket ticketTres = new Ticket();
        ticketTres.setBus(busDos);
        ticketTres.setId(2);
        ticketTres.setRuta(rutaCosta);

        Cliente clienteTres = new Cliente();
        System.out.println("Ingrese nombre del cliente Tres: ");
        clienteTres.setNombre(sc.nextLine());
        Date fechaTres = new Date();
        String fecVentaTres = sdf.format(fechaTres);

        ticketTres.setFecha(fecVentaTres);
        ticketTres.setCliente(clienteTres);

        System.out.println("Resultado:");
        System.out.println("Fecha ejecución: " + fechaEjecucion);
        System.out.println("Cliente uno: " + clienteUno.getNombre() + " Fecha venta: " + fecVentaUno);
        System.out.println("Cliente dos: " + clienteDos.getNombre() + " Fecha venta: " + fecVentaDos);
        System.out.println("Cliente tres: " + clienteTres.getNombre() + " Fecha venta: " + fecVentaTres);

        // =========================================
        // =========================================
        // ======  CREACION DE LA VENTA  ===========
        Ventas ventaDia = new Ventas();
        ventaDia.setEmpresa(empresa);

        Ticket[] ticketsDia = new Ticket[3];
        ticketsDia[0] = ticketUno;
        ticketsDia[1] = ticketDos;
        ticketsDia[2] = ticketTres;

        ventaDia.setTicket(ticketsDia);
        Ticket[] tiquete = ventaDia.getTicket();
        double dato = ventaDia.imprimirVentas(tiquete);
        System.out.println("Las ventas del dia fueron: $" + ventaDia.getTotal());

        // Solicitar por consola la cantidad de tickets que el cliente va a comprar
        // implementar metodos de la clase venta
        //calcular iva
        //calcularSubtotal
        //calcular total
        System.out.println("Ingrese la cantidad de tikects");
        
        int opcion = sc.nextInt();
       

    }
