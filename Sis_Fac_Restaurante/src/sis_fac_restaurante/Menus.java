
package sis_fac_restaurante;

//Todos los menus del restaurante se van a encontrar dentro de esta clase para ser desplegados en el formulario Ingresar_Pedido
public class Menus {

    public String [][] menuRapido = {{"9", "Hamburguesa de queso con papas", "3500"}, 
                                     {"10", "Perros calientes", "1500"},
                                     {"11", "Nuggets", "2500"},
                                     {"12", "Papas supremas", "3500"},
                                     {"13", "Burritos", "2500"},
                                     {"14", "Dedos de queso", "2000"},
                                     {"15", "Alitas", "5000"},
                                     {"16", "Fajitas de Pollo", "4000"}};
    
    public String [][] menuVegetariano = {{"17", "Sopa de tomate", "2000"}, 
                                     {"18", "Arroz con Verduras cocidas", "3500"},
                                     {"19", "Mac and cheese", "3000"},
                                     {"20", "Hummus", "3500"},
                                     {"21", "Ensalada", "1500"},
                                     {"22", "Sopa de frijol", "2000"},
                                     {"23", "Sopa de cebolla", "2000"},
                                     {"24", "Papas Bravas", "4000"}};
    
    public String [][] menuLicores = {{"25", "Cerveza", "1500"}, 
                                     {"26", "Mojito", "2000"},
                                     {"27", "Piña colada", "2000"},
                                     {"28", "Taikiri", "2500"},
                                     {"29", "Botella de Vino", "12500"},
                                     {"30", "Vodka", "6000"},
                                     {"31", "Margarita", "3000"},
                                     {"32", "Sangria", "4000"}};
    
    public String [][] menuNaturales = {{"33", "Fresco de Frutas", "2000"}, 
                                     {"34", "Fresco de Piña", "2000"},
                                     {"35", "Fresco de Sandia", "2000"},
                                     {"36", "Fresco de Fresa", "2000"},
                                     {"37", "Fresco de Mango", "2000"},
                                     {"38", "Fresco de Melon", "2000"},
                                     {"39", "Fresco de Guanabana", "2000"},
                                     {"40", "Hierba Buena", "3000"}};
    
    public String [][] menuGaseosas = {{"41", "Fresco de Frutas", "3500"}, 
                                     {"42", "CocaCola", "1800"},
                                     {"43", "Fresca", "2000"},
                                     {"44", "7 UP", "2000"},
                                     {"45", "Sarsa", "2000"},
                                     {"46", "Fanta de Uva", "2000"},
                                     {"47", "Fanta Naraja", "2000"},
                                     {"48", "Fanta Roja", "2000"}};
    
    
    //El menu menuEntero va a contener todos los productos del restaurante, va a ser el que se va a utilizar interna y logicamente en el programa
    public String [][] menuEntero = {{"t", "1", "Gallopinto con huevo", "3000"}, 
                                     {"t", "2", "Olla de Carne", "5000"},
                                     {"t", "3", "Tortilla con Queso", "2500"},
                                     {"t", "4", "Chifrijo", "3500"},
                                     {"t", "5", "Vigoron", "3500"},
                                     {"t", "6", "Sopa Negra", "3000"},
                                     {"t", "7", "Platano con Queso", "2700"},
                                     {"t", "8", "Arroz con Pollo", "4000"},
                                     {"r", "9", "Hamburguesa de queso con papas", "3500"}, 
                                     {"r", "10", "Perros calientes", "1500"},
                                     {"r", "11", "Nuggets", "2500"},
                                     {"r", "12", "Papas supremas", "3500"},
                                     {"r", "13", "Burritos", "2500"},
                                     {"r", "14", "Dedos de queso", "2000"},
                                     {"r", "15", "Alitas", "5000"},
                                     {"r", "16", "Fajitas de Pollo", "4000"},
                                     {"v", "17", "Sopa de tomate", "2000"}, 
                                     {"v", "18", "Arroz con Verduras cocidas", "3500"},
                                     {"v", "19", "Mac and cheese", "3000"},
                                     {"v", "20", "Hummus", "3500"},
                                     {"v", "21", "Ensalada", "1500"},
                                     {"v", "22", "Sopa de frijol", "2000"},
                                     {"v", "23", "Sopa de cebolla", "2000"},
                                     {"v", "24", "Papas Bravas", "4000"},
                                     {"l", "25", "Cerveza", "1500"}, 
                                     {"l", "26", "Mojito", "2000"},
                                     {"l", "27", "Piña colada", "2000"},
                                     {"l", "28", "Taikiri", "2500"},
                                     {"l", "29", "Botella de Vino", "12500"},
                                     {"l", "30", "Vodka", "6000"},
                                     {"l", "31", "Margarita", "3000"},
                                     {"l", "32", "Sangria", "4000"},
                                     {"n", "33", "Fresco de Frutas", "2000"}, 
                                     {"n", "34", "Fresco de Piña", "2000"},
                                     {"n", "35", "Fresco de Sandia", "2000"},
                                     {"n", "36", "Fresco de Fresa", "2000"},
                                     {"n", "37", "Fresco de Mango", "2000"},
                                     {"n", "38", "Fresco de Melon", "2000"},
                                     {"n", "39", "Fresco de Guanabana", "2000"},
                                     {"n", "40", "Hierba Buena", "3000"},
                                     {"n", "41", "Ginger Ale", "3500"}, 
                                     {"g", "42", "CocaCola", "1800"},
                                     {"g", "43", "Fresca", "2000"},
                                     {"g", "44", "7 UP", "2000"},
                                     {"g", "45", "Sarsa", "2000"},
                                     {"g", "46", "Fanta de Uva", "2000"},
                                     {"g", "47", "Fanta Naraja", "2000"},
                                     {"g", "48", "Fanta Roja", "2000"}};
}
