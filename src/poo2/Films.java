package poo2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Films extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    JLabel L1,L2,L3;
    JPanel p1;
    JTextField t1,t2;
    public Films()
    {
        setBounds(500, 100, 200, 500);
        setLayout(new FlowLayout());
        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        L1=new JLabel("CARTELERA");
        b1=new JButton("Ver Cartelera");
        L2=new JLabel("Nombre de la pelicula a buscar");
        t1=new JTextField(10);
        b2=new JButton("Buscar");
        L3=new JLabel("¿Cuantas entradas desea comprar?");
        t2=new JTextField(10);
        b3=new JButton("Comprar");
        b4=new JButton("Total ventas");
        add (L1);
        add (b1);
        add (L2);
        add (t1);
        add (b2);
        add (L3);
        add (t2);
        add (b3);
        add (b4);
       b1.addActionListener(this); 
       b1.setActionCommand("ver cartelera");
       b2.addActionListener(this); 
       b2.setActionCommand("buscar");
       b3.addActionListener(this); 
       b3.setActionCommand("comprar");
       b4.addActionListener(this); 
       b4.setActionCommand("total");
       t1.addActionListener(this);
       
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae) 
    {
       String lista;
       int cont=0;
       lista="Avengers\n" +"El_Rey_León\n" +"Frozen_II\n" +"Spider_Man\n" +"Capitana_Marvel\n" +"Toy_Story_4\n" +"Joker\n" +"Aladdín\n" +"Rápidos_y_furiosos_9\n" +"Star_Wars";
        if (ae.getActionCommand().equals("ver cartelera"))
        {
            JOptionPane.showMessageDialog(null,lista);
        }
        if (ae.getActionCommand().equals("buscar"))
        {
            met();
        }
        if (ae.getActionCommand().equals("comprar"))
        {
            JOptionPane.showMessageDialog(null,"Gracias por su compra");
        }
        if (ae.getActionCommand().equals("total"))
        {
            ventas();
        }
    }
    public void ventas()
    {
        int b,c=0;
        b=Integer.parseInt(t2.getText());
        c+=b;
        JOptionPane.showMessageDialog(null,c);
    }
    public void met() 
    {
     String a;
     
     a=(t1.getText());
     
        Pelicula avengers =new Pelicula("Avengers: Endgame","Joe Russo, Anthony Russo","Los Vengadores restantes deben encontrar \nuna manera de recuperar a sus \naliados para un enfrentamiento épico \ncon Thanos, el malvado que diezmó \nel planeta y el universo.", 2019);
        Pelicula el_rey_leon =new Pelicula("El Rey León","Jon Favreau","Tras el asesinato de su padre, Simba, \nun joven león es apartado su reino y tendrá \nque descubrir con ayuda de amigos \nde la sabana africana el significado de la \nresponsabilidad y la valentía. \nMás tarde volverá para recuperar el control de su reino.", 2019);
        Pelicula frozen_2=new Pelicula("Frozen II"," Jennifer Lee, Chris Buck","Elsa tiene un poder extraordinario: es capaz de crear hielo y nieve. \nSin embargo, a pesar de lo feliz que la hacen los \nhabitantes de Arendelle, siente que no encaja allá. \nDespués de oír una voz misteriosa, Elsa, \nacompañada por Anna, Kristoff, Olaf y Sven, \nviaja a los bosques embrujados y los mares \noscuros que se extienden más allá de los \nlímites de su reino para descubrir quién \nes en realidad y por qué posee un poder tan asombroso.", 2019);
        Pelicula spider_man =new Pelicula("Spider-Man:Lejos de Casa","Jon Watts","Peter Parker decide pasar unas merecidas \nvacaciones en Europa junto a MJ, Ned y el resto \nde sus amigos. Sin embargo, Peter debe volver a \nponerse el traje de Spider-Man cuando Nick Fury \nle encomienda una nueva misión: frenar el ataque de \nunas criaturas que están causando el caos \nen el continente.", 2019);
        Pelicula capitana_marvel =new Pelicula("Capitana Marvel","Anna Boden, Ryan Fleck","Una guerrera extraterrestre de la civilización \nKree se encuentra atrapada en medio de una batalla.\nCon la ayuda de Nick Fury trata de descubrir \nlos secretos de su pasado mientras aprovecha sus \npoderes para terminar la guerra.", 2019);
        Pelicula toy_story_4 =new Pelicula("Toy Story 4","Josh Cooley","Woody siempre ha tenido claro cuál es su labor en el mundo \ny cuál es su prioridad: cuidar a su dueño, \nya sea Andy o Bonnie. Sin embargo, Woody \ndescubrirá lo grande que puede ser el mundo \npara un juguete cuando Forky se convierta en \nsu nuevo compañero de habitación.", 2019);
        Pelicula joker =new Pelicula("Guason","Todd Phillips","Arthur Fleck adora hacer reír a la gente, \npero su carrera como comediante es un fracaso. \nEl repudio social, la marginación y una serie \nde trágicos acontecimientos lo conducen por el sendero \nde la locura y, finalmente, cae en el mundo del crimen.", 2019);
        Pelicula aladdin =new Pelicula("Aladdín","Guy Ritchie","Aladdin es un ladronzuelo que se enamora de \nla hija del Sultán, la princesa Jasmine. \nPara poder conquistarla aceptará un desafío de Jafar. \nAladdín tendrá que entrar en una cueva en mitad del desierto \ny conseguir una lámpara mágica que contiene al Genio \nque será el encargado de concederle todos sus deseos.", 2019);
        Pelicula rapidos_y_furiosos_9=new Pelicula("Rápidos y furiosos:Hobbs & Shaw","Justin Lin","La novena película Fast and Furious \nsigue las emocionantes aventuras y \ncarreras del equipo de amigos, \ntras la traición de Dominic Toretto.", 2019);
        Pelicula star_wars =new Pelicula("Star Wars: El ascenso de Skywalker"," J. J. Abrams","La Resistencia sobreviviente se enfrenta \na la Primera Orden, y Rey, Finn, Poe y \nel resto de los héroes encararán nuevos retos \ny una batalla final con la sabiduría de las \ngeneraciones anteriores.", 2019);
        
// Definir un ArrayList llamado cine
        ArrayList<Pelicula> cine =new ArrayList<>();
// Agregamos estas instancias al ArrayList con el método add 
        cine.add(avengers);
        cine.add(el_rey_leon);
        cine.add(frozen_2);
        cine.add(spider_man);
        cine.add(capitana_marvel);
        cine.add(toy_story_4);
        cine.add(joker);
        cine.add(aladdin);
        cine.add(rapidos_y_furiosos_9);
        cine.add(star_wars);
    
        
     if (a.equalsIgnoreCase("avengers")) JOptionPane.showMessageDialog(null,avengers);
     else if (a.equalsIgnoreCase("Frozen 2"))JOptionPane.showMessageDialog(null,frozen_2);
     else if (a.equalsIgnoreCase("el rey leon"))JOptionPane.showMessageDialog(null,el_rey_leon);
     else if (a.equalsIgnoreCase("spider man"))JOptionPane.showMessageDialog(null,spider_man);
     else if (a.equalsIgnoreCase("capitana marvel"))JOptionPane.showMessageDialog(null,capitana_marvel);
     else if (a.equalsIgnoreCase("toy story 4"))JOptionPane.showMessageDialog(null,toy_story_4);
     else if (a.equalsIgnoreCase("joker"))JOptionPane.showMessageDialog(null,joker);
     else if (a.equalsIgnoreCase("aladdin"))JOptionPane.showMessageDialog(null,aladdin);
     else if (a.equalsIgnoreCase("rapidos y furiosos 9"))JOptionPane.showMessageDialog(null,rapidos_y_furiosos_9);
     else if (a.equalsIgnoreCase("star wars"))JOptionPane.showMessageDialog(null,star_wars);
     else    JOptionPane.showMessageDialog(null,"La pelicula no esta en cartelera");
     
     
}
}