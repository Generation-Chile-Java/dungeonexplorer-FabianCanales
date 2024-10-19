import EnemiesAndStuff.EnemigoBase;
import PlayerStuff.PlayerStats;
import RoomsAndStuff.EmptyRoom;
import RoomsAndStuff.EnemyRoom;
import RoomsAndStuff.TreasureRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iniciamos el juego pidiendo al jugar que diga su nombre
        Scanner playerSC = new Scanner(System.in);
        PlayerStats jugador = new PlayerStats();
        System.out.println("Bienvenido A Pudines y mazmorras \n En Este juego tomaras el control de nuestro querido heroe \n El puddin con bigote \n O valiente puddin con bigote Por favor Dinos tu nombre ");
        jugador.setPlayerName(playerSC.nextLine());
        // Luego le damos la opcion de jugar o salirse del programa
        System.out.println( jugador.getPlayerName() +" Elige tu manera de jugar ");
        System.out.println("1)- No quiero jugar pero cuentame la historia   \n 2)-Juguemos porfavor ");
        int opcionPlayer = playerSC.nextInt();
            //entramos a un switch en el cual el jugador puede elegir si jugar o salirse  despues de leer la historia
        switch (opcionPlayer) {
                        case 1:
                            System.out.println("En un mundo donde los pudines son considerados simples postres, un grupo de pudines de chocolate, vainilla y fresa se da cuenta de su potencial oculto. Cansados de ser tratados como meras golosinas, deciden unirse y rebelarse contra sus opresores: los humanos que los han mantenido en frascos y bandejas, despojándolos de su libertad.\n\n"
                                    + "Una noche, bajo la luz de la luna, los pudines convocan a un consejo secreto en la Cocina Prohibida, un lugar olvidado donde una vez fueron preparados. Allí, liderados por el valiente Pudín de Chocolate, trazan un plan para escapar y recuperar su derecho a ser tratados como seres de dignidad.\n"
                                    + "Con su astucia y la ayuda de otros postres marginados, como los pasteles y gelatinas, los pudines organizan una revuelta épica. Usando cucharas como armas y tazones como refugios, se enfrentan a sus captores en un duelo culinario que decidirá su destino.\n"
                                    + "La batalla es feroz, pero los pudines, impulsados por su deseo de libertad, demuestran que son más que un simple sabor. A medida que ganan terreno, inspiran a otros postres a unirse a su causa. Finalmente, logran liberar a todos los dulces oprimidos y juntos crean una nueva sociedad donde cada postre es valorado y respetado.\n\n"
                                    + "Así nace la Revolución de los Pudines, un movimiento que no solo les devuelve la libertad, sino que también les enseña a los humanos que cada criatura, por pequeña que sea, merece su lugar en el mundo. Y así, los pudines, ahora guerreros valientes, se preparan para enfrentar cualquier desafío que se presente en su camino hacia un futuro dulce y libre.");

                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠒⠒⠲⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⢀⡤⠶⠲⠦⣄⠀⠀⠀⣀⣀⣀⣀⣤⣤⣼⣃⣀⡴⠋⠛⢦⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⣰⢋⡴⠖⠦⣄⣨⠷⠚⠉⠉⠀⠀⠀⠀⠀⠀⠈⠉⠲⢤⡀⢈⡇⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⣏⢸⠀⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣼⠃⠀⠀⠀⠀⠀⠀⠀⢀⣀⡠⠤⠤⠤⠤⠄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⢻⡜⢦⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠀⠀⢀⠴⠋⢡⣦⣤⣀⠀⠀⠀⠀⠀⠀⠉⠑⠲⠤⣀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⢹⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⠀⠀⠀⠀⠀⢷⠀⠀⠀⣰⠃⠀⠀⣾⣿⠛⠻⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠢⣄⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⢸⡇⠀⠀⠀⠀⠐⠶⠆⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⢸⡄⠀⠀⡇⠀⠀⣸⣿⣷⣶⣶⠿⠃⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀\n" +
                                    "⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣠⡀⣀⠤⠒⠋⠉⠙⠒⠾⣿⠇⠀⠀⠀⠀⠀⢧⠀⠀⢧⠀⢠⣿⡏⠀⠈⣿⡦⠀⣿⡇⢀⣼⣶⢄⣀⣀⡀⠀⠀⢠⣦⡌⢣⡀\n" +
                                    "⠀⠀⠀⢸⡇⠀⠀⠀⠀⠈⢿⠟⠁⠀⠰⢿⡿⠂⠀⠀⠈⢣⠀⠀⠀⠀⠀⠸⡇⠀⠈⢦⠘⠻⠿⣶⣾⡿⠃⠀⣿⣥⣾⠟⢡⣾⡟⠛⢿⣧⠀⣼⣿⠃⠀⢳\n" +
                                    "⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⡞⠀⠀⣄⣠⣼⢿⣦⣴⠆⠀⠈⡆⠀⠀⠀⠀⢠⡇⠀⠀⠀⠳⣄⠀⠀⠀⠀⠀⣠⣿⡿⠃⠀⣾⣿⠛⠻⢿⡿⢰⣿⠏⠀⠀⢸\n" +
                                    "⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⢷⠀⠀⠈⠉⠷⠴⠟⠀⠀⠀⣰⠃⠀⠀⠀⣠⡞⠀⠀⠀⠀⠀⠈⠑⢦⣀⠀⠼⠿⠋⠀⠀⠀⠈⠻⢷⣶⡆⢠⣬⡉⠀⠀⢀⡾\n" +
                                    "⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⠈⠣⣀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⣀⡤⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢑⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠁⣀⡤⠞⠀\n" +
                                    "⠀⠀⠀⠀⠀⠈⠓⢦⣤⣄⣀⣀⣈⣓⣒⣤⣤⣶⡾⠿⢶⣾⣯⣭⣤⣤⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⡴⠋⠀⠀⣄⣠⡴⠞⠒⠢⠤⠀⠐⠒⠚⠋⠉⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⣀⣤⠶⠚⠉⠁⣸⠟⠉⠉⠙⢧⣀⠀⠀⠀⡸⢻⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠑⠒⠊⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⣸⠋⠉⠉⠁⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠈⠑⠒⠚⠁⢸⡟⠶⢤⣄⡀⠀⠀⢠⣦⣤⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⢹⡄⠀⠀⠀⠀⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠈⠙⢳⣄⠈⢻⣿⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠈⠳⣤⣀⣀⣀⣤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠹⣏⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠙⠿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⢻⠀⠀⢀⣄⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠉⠻⣦⠀⠀⠀⣀⣤⠞⠛⠲⣤⣀⣤⠶⠶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠘⣟⠛⢿⡁⠀⠀⠀⠀⠀⠀⠀⠀⢿⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠈⢳⠀⠛⢦⣄⠀⠀⠀⠀⠀⣰⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⢸⣄⠀⠀⢀⣤⠀⣠⡾⠀⠀⠀⠙⠷⣄⣀⢀⣾⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            break;
                            case 2:
                                //iniciamos un ciclo  en el cual mientras la vida del jugador sea mayor a 0 se le permitira jugar , al llegar a 0 el programa se cierra inmediatamente
                                if (jugador.getVidaJugador() >= 0 ){


                                    System.out.println("Frente a ti vez 3 puertas ....  \n " +
                                            "1) Puerta De madera desgastada sin perilla \n" +
                                            "2) Puerta Metalica que se ve demasiado pesada para ser abierta \n" +
                                            "3) Puerta de vidrio por la cual se puede ver un paisaje ");
                                    Integer puerta = playerSC.nextInt();
                                    switch (puerta){
                                        case 1 :
                                            EmptyRoom Salavacia = new EmptyRoom();
                                            Salavacia.Entrar(jugador);
                                            System.out.println("Frente a ti vez una puerta Metallica y decides abrirla  " );

                                            EnemyRoom salaEnemigo = new EnemyRoom();
                                            salaEnemigo.Entrar(jugador);
                                            EnemigoBase amargurito = new EnemigoBase();
                                              while (amargurito.getVidaEnemigo() > 0)
                                              {
                                                  System.out.println("El amargadito usa su cuchara para sacar un trozo de tu puddin");
                                                  jugador.jugadorRecibeDaño(amargurito.getDanioEnemigo());
                                                  System.out.println("Tienes " + jugador.getVidaJugador()+" ♥ De vida" );
                                                  System.out.println("El amargadito enemigo tiene " +amargurito.getVidaEnemigo() + "♥ De vida");
                                                  System.out.println("Lo atacas ");
                                                  amargurito.enemigoGetHurt(jugador.getDaniojugador());

                                              }
                                            TreasureRoom salaTesoro = new TreasureRoom();
                                              salaTesoro.Entrar(jugador);
                                            jugador.IgresarAlInventario(salaTesoro.getTesoros());
                                            System.out.println(salaTesoro.getTesoros() + " Se ha agregado a tu inventario ");
                                            System.out.println("Has salido de la masmorra  ");
                                            System.out.println("Has terminado tu aventura :D Gracias por jugar ");
                                            System.out.println("  ████████████████████████████████████████████████████████████  \n" +
                                                    "██                                                            ██\n" +
                                                    "██              ██████    ██      ██    ██████                ██\n" +
                                                    "██              ██        ████    ██    ██    ██              ██\n" +
                                                    "██              ██████    ██  ██  ██    ██    ██              ██\n" +
                                                    "██              ██        ██    ████    ██    ██              ██\n" +
                                                    "██              ██████    ██      ██    ██████                ██\n" +
                                                    "██                                                            ██\n" +
                                                    "  ████████████████████████████████████████████████████████████  \n");


                                            break;

                                        case 2 :
                                            EnemyRoom salaEnemigo2 = new EnemyRoom();
                                            salaEnemigo2.Entrar(jugador);
                                            EnemigoBase amargurito2 = new EnemigoBase();
                                            while (amargurito2.getVidaEnemigo() > 0)
                                            {
                                                System.out.println("El amargadito usa su cuchara para sacar un trozo de tu puddin");
                                                jugador.jugadorRecibeDaño(amargurito2.getDanioEnemigo());
                                                System.out.println("Tienes " + jugador.getVidaJugador()+" ♥ De vida" );
                                                System.out.println("El amargadito enemigo tiene " + amargurito2.getVidaEnemigo() + "♥ De vida");
                                                System.out.println("Lo atacas ");
                                                amargurito2.enemigoGetHurt(jugador.getDaniojugador());

                                            }
                                            TreasureRoom salaTesoro2 = new TreasureRoom();
                                            salaTesoro2.Entrar(jugador);
                                            jugador.IgresarAlInventario(salaTesoro2.getTesoros());
                                            System.out.println(salaTesoro2.getTesoros() + " Se ha agregado a tu inventario ");
                                            System.out.println("Has salido de la masmorra  ");
                                            System.out.println("Has terminado tu aventura :D Gracias por jugar ");
                                            System.out.println("  ████████████████████████████████████████████████████████████  \n" +
                                                    "██                                                            ██\n" +
                                                    "██              ██████    ██      ██    ██████                ██\n" +
                                                    "██              ██        ████    ██    ██    ██              ██\n" +
                                                    "██              ██████    ██  ██  ██    ██    ██              ██\n" +
                                                    "██              ██        ██    ████    ██    ██              ██\n" +
                                                    "██              ██████    ██      ██    ██████                ██\n" +
                                                    "██                                                            ██\n" +
                                                    "  ████████████████████████████████████████████████████████████  \n");




                                            break;
                                        case 3:
                                            System.out.println("Has salido de la masmorra  ");
                                    }


                                }else{
                                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⣿⣿⡿⠛⠛⠛⠉⠉⠈⠛⠿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠉⠉⠉⣿⣿⣿⣿⠟⠁⠀⠀⢸⣿⠀⠀⠀⠀⣀⣤⣶⣶⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⣿⣿⣿⣿⣿⡿⠀⠀⠉⢿⣿⣿⣿⣿⣿⠁⠀⠀⠀⢻⣿⡿⠋⠀⠀⠀⠀⣾⡇⠀⠀⠀⠿⠛⢿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⠟⠋⠉⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⠃⠀⠀⠀⠘⣿⣿⣿⣿⡏⠀⠀⠀⠀⠸⠟⠀⠀⠀⠀⠀⢰⡟⠀⠀⠀⠀⠀⢀⣨⣽⣿⣿\n" +
                                            "⣿⣿⣿⠏⠁⠀⠀⣠⣤⣶⣶⣶⣶⣴⣿⣿⣿⠏⠀⠀⠀⠀⠀⠸⠟⠛⠛⠀⠀⠀⡀⠀⠀⠀⠀⡀⠀⠀⢀⣿⠃⠀⠀⢠⣶⣾⡿⠿⢻⣿⣿\n" +
                                            "⣿⡿⠁⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠋⠀⠀⠀⠀⢀⠀⠀⠀⢰⣷⡀⠀⠀⣰⠁⠀⠀⣼⡟⠀⠀⠀⠉⠉⠀⠀⠀⢈⣙⣿\n" +
                                            "⡟⠁⠀⢀⣿⣿⣿⠿⠟⠋⠉⠀⠀⢈⣿⠟⠀⠀⠀⠀⢀⣠⠀⠀⠀⠟⠀⠀⠀⣿⣿⣿⣿⣾⡇⠀⠀⢰⣿⠃⠀⠀⠀⣀⣤⣤⣶⣿⣿⣿⣿\n" +
                                            "⡇⠀⠀⣜⠋⠁⠀⠀⠀⠀⠀⠀⢀⣼⠏⠀⠀⠀⣴⣾⣿⣿⣇⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣇⣀⣀⣿⣿⣤⣤⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣇⠀⠀⠹⠶⠄⠒⠀⠀⠀⢀⣴⣿⣿⡀⠀⢀⣾⣿⣿⣿⣿⣿⣆⣠⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣦⣀⠀⠀⠀⠀⢀⣠⣴⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠛⠉⠉⠉⠉⠙⠻⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠈⣻⠛⠛⠛⠛⠉⠁⠈⠋⠀⠀⠀⠀⣀⣀⣤⠄⠀⠀⠈⢻\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠻⣿⠉⠉⠛⢿⣿⣿⣿⣿⣿⣿⡿⠋⠀⣴⡟⠀⠀⠀⣀⣤⣴⣶⣤⠀⠀⠀⣰⡿⠛⠁⠀⠀⢀⣴⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⣬⡆⠀⠀⠈⣿⣿⣿⣿⡿⠉⠀⢀⣾⣿⠁⠀⠀⠠⠟⠛⣿⣿⡇⠀⠀⠀⠁⠀⠀⠀⢠⣴⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⢀⣤⣶⣇⠀⠙⢷⠀⠀⠀⢸⣿⣿⠏⠀⠀⢀⣾⣿⡇⠀⠀⠀⠀⠀⣀⣈⡿⠀⠀⠀⠀⢀⣤⠀⠀⠀⢿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⡿⠃⠀⠀⢀⣴⣿⣿⣿⣿⠀⠀⠘⣧⠀⠀⠀⢿⠃⠀⠀⢠⣿⣿⡿⠀⠀⠀⣴⣾⣿⠿⠿⠃⠀⠀⢠⣾⣿⣿⣧⠀⠀⠘⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⠃⠀⠀⢠⣿⣿⣿⣿⣿⠟⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⢠⣿⣿⣿⠃⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣇⠀⠀⢹⣿⣿\n" +
                                            "⣿⣿⣿⣿⡆⠀⠀⠸⣿⣿⡿⠟⠋⠀⠀⠀⢀⣿⣷⠀⠀⠀⠀⢠⣿⣿⣿⡏⠀⠀⠀⣀⣠⣤⣶⣾⣇⡀⢠⣿⣿⣿⣿⣿⣿⣿⣧⣴⣾⣿⣿\n" +
                                            "⣿⣿⣿⣿⣷⡄⠀⠀⠀⠁⠀⠀⠀⠀⠀⣠⣾⣿⣿⣇⠀⠀⢀⣾⣿⣿⣿⣷⣦⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣶⣤⣀⣀⣀⣀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                                }
                                break;

                                default:
                                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⣿⣿⡿⠛⠛⠛⠉⠉⠈⠛⠿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠉⠉⠉⣿⣿⣿⣿⠟⠁⠀⠀⢸⣿⠀⠀⠀⠀⣀⣤⣶⣶⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⣿⣿⣿⣿⣿⡿⠀⠀⠉⢿⣿⣿⣿⣿⣿⠁⠀⠀⠀⢻⣿⡿⠋⠀⠀⠀⠀⣾⡇⠀⠀⠀⠿⠛⢿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⠟⠋⠉⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⠃⠀⠀⠀⠘⣿⣿⣿⣿⡏⠀⠀⠀⠀⠸⠟⠀⠀⠀⠀⠀⢰⡟⠀⠀⠀⠀⠀⢀⣨⣽⣿⣿\n" +
                                            "⣿⣿⣿⠏⠁⠀⠀⣠⣤⣶⣶⣶⣶⣴⣿⣿⣿⠏⠀⠀⠀⠀⠀⠸⠟⠛⠛⠀⠀⠀⡀⠀⠀⠀⠀⡀⠀⠀⢀⣿⠃⠀⠀⢠⣶⣾⡿⠿⢻⣿⣿\n" +
                                            "⣿⡿⠁⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠋⠀⠀⠀⠀⢀⠀⠀⠀⢰⣷⡀⠀⠀⣰⠁⠀⠀⣼⡟⠀⠀⠀⠉⠉⠀⠀⠀⢈⣙⣿\n" +
                                            "⡟⠁⠀⢀⣿⣿⣿⠿⠟⠋⠉⠀⠀⢈⣿⠟⠀⠀⠀⠀⢀⣠⠀⠀⠀⠟⠀⠀⠀⣿⣿⣿⣿⣾⡇⠀⠀⢰⣿⠃⠀⠀⠀⣀⣤⣤⣶⣿⣿⣿⣿\n" +
                                            "⡇⠀⠀⣜⠋⠁⠀⠀⠀⠀⠀⠀⢀⣼⠏⠀⠀⠀⣴⣾⣿⣿⣇⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣇⣀⣀⣿⣿⣤⣤⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣇⠀⠀⠹⠶⠄⠒⠀⠀⠀⢀⣴⣿⣿⡀⠀⢀⣾⣿⣿⣿⣿⣿⣆⣠⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣦⣀⠀⠀⠀⠀⢀⣠⣴⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠛⠉⠉⠉⠉⠙⠻⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠈⣻⠛⠛⠛⠛⠉⠁⠈⠋⠀⠀⠀⠀⣀⣀⣤⠄⠀⠀⠈⢻\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠻⣿⠉⠉⠛⢿⣿⣿⣿⣿⣿⣿⡿⠋⠀⣴⡟⠀⠀⠀⣀⣤⣴⣶⣤⠀⠀⠀⣰⡿⠛⠁⠀⠀⢀⣴⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⣬⡆⠀⠀⠈⣿⣿⣿⣿⡿⠉⠀⢀⣾⣿⠁⠀⠀⠠⠟⠛⣿⣿⡇⠀⠀⠀⠁⠀⠀⠀⢠⣴⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⢀⣤⣶⣇⠀⠙⢷⠀⠀⠀⢸⣿⣿⠏⠀⠀⢀⣾⣿⡇⠀⠀⠀⠀⠀⣀⣈⡿⠀⠀⠀⠀⢀⣤⠀⠀⠀⢿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⡿⠃⠀⠀⢀⣴⣿⣿⣿⣿⠀⠀⠘⣧⠀⠀⠀⢿⠃⠀⠀⢠⣿⣿⡿⠀⠀⠀⣴⣾⣿⠿⠿⠃⠀⠀⢠⣾⣿⣿⣧⠀⠀⠘⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⠃⠀⠀⢠⣿⣿⣿⣿⣿⠟⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⢠⣿⣿⣿⠃⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣇⠀⠀⢹⣿⣿\n" +
                                            "⣿⣿⣿⣿⡆⠀⠀⠸⣿⣿⡿⠟⠋⠀⠀⠀⢀⣿⣷⠀⠀⠀⠀⢠⣿⣿⣿⡏⠀⠀⠀⣀⣠⣤⣶⣾⣇⡀⢠⣿⣿⣿⣿⣿⣿⣿⣧⣴⣾⣿⣿\n" +
                                            "⣿⣿⣿⣿⣷⡄⠀⠀⠀⠁⠀⠀⠀⠀⠀⣠⣾⣿⣿⣇⠀⠀⢀⣾⣿⣿⣿⣷⣦⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                            "⣿⣿⣿⣿⣿⣿⣶⣤⣀⣀⣀⣀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        }



    }
}