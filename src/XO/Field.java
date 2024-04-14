package XO;

class Field {
    boolean bol = true;
    static int[] X = new int[5];
    static int[] O = new int[4];
    private int P1;
    private int P2;
    int tos = -1;
    int tos1 = -1;

    void pushX(int item) {
        X[++tos] = item;
    }

    void pushO(int item) {
        O[++tos1] = item;
    }

    public void setP1(int p1) {
        set:
        {
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < O.length; j++) {
                    if (p1 != X[i] && p1 != O[j]) {

                        P1 = p1;
                    }
                    if (p1 == X[i] || p1 == O[j]) {
                        System.out.println("Такой ход уже был");
                        P1 = 0;

                        break set;
                    }
                }
            }
        }
        if (P1 == 0) {

            System.out.println("Попробуй еще раз");
        } else {
            pushX(P1);
            bol = false;
        }
    }

    public void setP2(int p2) {
        set:
        {
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < O.length; j++) {
                    if (p2 != X[i] && p2 != O[j]) {

                        P2 = p2;
                    }
                    if (p2 == X[i] || p2 == O[j]) {
                        System.out.println("Такой ход уже был");
                        P2 = 0;

                        break set;

                    }
                }

            }
        }
        if (P2 == 0) {
            System.out.println("Попробуй еще раз");
            bol = true;
        } else {
            pushO(P2);
            bol = false;
        }
    }

    public int getP1() {
        return P1;
    }

    public int getP2() {
        return P2;
    }

    public void win() {
        GameLogic game=new GameLogic();
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 1) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 2) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 3) {
                                System.out.println("Крестики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (X[i] == 4) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 5) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 6) {
                                System.out.println("Крестики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (X[i] == 7) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 8) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 9) {
                                System.out.println("Крестики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (X[i] == 1) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 4) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 9){ System.out.println("Крестики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (X[i] == 2) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 5) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 8){
                                System.out.println("Крестики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (X[i] == 3) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 6) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 9){ System.out.println("Крестики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (X[i] == 1) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 5) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 9){ System.out.println("Крестики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (X[i] == 3) {
                for (int j = 0; j < X.length; j++) {
                    if (X[j] == 5) {
                        for (int k = 0; k < X.length; k++) {
                            if (X[k] == 7){ System.out.println("Крестики выиграли");
                                game.run();}
                        }
                    }
                }
            }
        }
        for (int i = 0; i < O.length; i++) {
            if (O[i] == 1) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 2) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 3) {
                                System.out.println("Нолики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (O[i] == 4) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 5) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 6) {
                                System.out.println("Нолики выиграли");
                                game.run();
                            }
                        }
                    }
                }
            } else if (O[i] == 7) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 8) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 9){ System.out.println("Нолики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (O[i] == 1) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 4) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 9){ System.out.println("Нолики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (O[i] == 2) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 5) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 8){ System.out.println("Нолики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (O[i] == 3) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 6) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 9){ System.out.println("Нолики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (O[i] == 1) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 5) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 9){ System.out.println("Нолики выиграли");
                                game.run();}
                        }
                    }
                }
            } else if (O[i] == 3) {
                for (int j = 0; j < O.length; j++) {
                    if (O[j] == 5) {
                        for (int k = 0; k < O.length; k++) {
                            if (O[k] == 7){ System.out.println("Нолики выиграли");
                            game.run();}
                        }
                    }
                }
            }
        }
    }
}