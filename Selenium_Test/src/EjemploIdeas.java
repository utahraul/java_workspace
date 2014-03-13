

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class EjemploIdeas {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ideasparatuboda.es/");
		selenium.start();
	}

	@Test
	public void testEjemploIdeas() throws Exception {
		selenium.open("\\");
		selenium.click("link=Tu boda en Color Naranja. Ideas para decorar tu boda.");
		selenium.waitForPageToLoad("30000");
		assertEquals("Tu boda en Color Naranja. Ideas para decorar tu boda.", selenium.getTitle());
		selenium.click("css=div.alignleft > a");
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.getTitle().matches("^exact:Zapatos de novia con color �Te atreves[\\s\\S]$"));
		selenium.click("link=Una PreBoda Hippie Chic");
		selenium.waitForPageToLoad("30000");
		assertEquals("Una PreBoda Hippie Chic", selenium.getTitle());
		selenium.click("link=�MAS DE 500 SEGUIDORES EN FACEBOOK!");
		selenium.waitForPageToLoad("30000");
		verifyEquals("�MAS DE 500 SEGUIDORES EN FACEBOOK!", selenium.getText("link=�MAS DE 500 SEGUIDORES EN FACEBOOK!"));
		selenium.click("link=PORTAVELAS DIY PARA TU BODA");
		selenium.waitForPageToLoad("30000");
		verifyEquals("PORTAVELAS DIY PARA TU BODA", selenium.getText("link=PORTAVELAS DIY PARA TU BODA"));
		selenium.click("link=Look para una Novia Rom�ntica");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Look para una Novia Rom�ntica", selenium.getText("link=Look para una Novia Rom�ntica"));
		selenium.click("link=exact:Boda en San Valent�n, �Romanticismo o Maldici�n?");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.getText("link=exact:Boda en San Valent�n, �Romanticismo o Maldici�n?").matches("^exact:Boda en San Valent�n, �Romanticismo o Maldici�n[\\s\\S]$"));
		selenium.click("link=Vestidos de Novia de Carolina Herrera 2014");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Vestidos de Novia de Carolina Herrera 2014", selenium.getText("link=Vestidos de Novia de Carolina Herrera 2014"));
		selenium.click("link=SORTEO � Ideasparatuboda.es y Tubodaenmadera.com SORTEAMOS una Cajita Porta-Anillos para Alianzas");
		selenium.waitForPageToLoad("30000");
		verifyEquals("SORTEO � Ideasparatuboda.es y Tubodaenmadera.com SORTEAMOS una Cajita Porta-Anillos para Alianzas", selenium.getText("link=SORTEO � Ideasparatuboda.es y Tubodaenmadera.com SORTEAMOS una Cajita Porta-Anillos para Alianzas"));
		selenium.click("link=Tu boda en madera. Figuras de novios personalizadas");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Tu boda en madera. Figuras de novios personalizadas", selenium.getText("link=Tu boda en madera. Figuras de novios personalizadas"));
		selenium.click("link=Dulces para Tu Boda");
		selenium.waitForPageToLoad("30000");
		verifyEquals("S�, lo confieso, soy una fan absoluta y empedernida del chocolate� en realidad, no s�lo del chocolate, sino de todo lo que tenga que ver con el az�car.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[2]"));
		selenium.click("link=El momento dulce de la boda: La Candy Bar");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Pod�is optar por dise�arla vosotros y contar con alg�n familiar o amigo de confianza que os la monte el d�a de la boda, nunca vosotros mismos, o por contratar a una empresa especializada en ello que se encargue del dise�o y el montaje. Si lo dise��is vosotros os saldr� m�s barato, pero si contrat�is a una empresa especializada os asegur�is que todo estar� el d�a de la boda c�mo hab�is contratado. Todo es cuesti�n del presupuesto del que dispong�is y de si ten�is a alguien de total confianza con quien contar ese d�a para que est� pendiente de montarla.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[4]"));
		selenium.click("link=Para la Invitada Perfecta: SONIA PE�A");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Para una boda de d�a se recomienda un traje de c�ctel, con un largo un poco por encima de la rodilla. En su colecci�n de 2014 Sonia Pe�a nos deja dise�os inspirados en los a�os 20 donde, las plumas y el glamour son el ingrediente principal.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[4]"));
		selenium.click("link=Novias Paula del Vas");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Novias Paula del Vas 26 septiembre 2013 | Autor: Marina Mart�nez Mart�nez \n Novias Paula del Vas � Adelanto Colecci�n 2014\n\n Hace unas semanas que comenc� a investigar y a descubrir dise�adores de moda Nupcial que, realmente, hacen maravillas con los diferentes tejidos y estilos.\n En esta ocasi�n os voy a presentar a una dise�adora Murciana cuyo trabajo es, simplemente, sublime. Paula del Vas consigue fundir un estilo rom�ntico con un toque de originalidad que hacen de cada uno de sus dise�os, �nicos e inigualables.\n Si te gustan las faldas con volumen, el tul puede ser uno de tus mayores aliados, aqu� os dejo algunos de sus dise�os incluidos en su colecci�n del 2012.\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2012\n\n Para las Novias cl�sicas, a las que os gustan los vestidos con ca�da y con un aire tradicional, Paula os deja estas sugerencias.\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2013\n\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2013\n\n EMEM By Paula del Vas Cibeles 2012\n\n Si eres una Novia �Menos es m�s� que buscas la sencillez sin renunciar a la originalidad echa un vistazo a estos vestidos, te enamorar�n.\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2012\n\n EMEM By Paula del Vas Cibeles 2013\n\n EMEM By Paula del Vas Cibeles 2013\n\n En definitiva, una Novia Rom�ntica y So�adora que no quiere dejar de lado la originalidad y la elegancia encontrar� en Paula del Vas todo lo que busca para su traje de Novia y mucho m�s.\n Art�culo escrito por Marina Mart�nez, autora del blog El rinconcico de la novia. S�guela en Facebook.\n \n\n Art�culos relacionados: NOVIAS �PRONOVIAS Y MUCHO MAS� Si hay alguna marca de trajes de Novia y de fiesta conocida en el mercado es, sin lugar a dudas, PRONOVIAS. He de confesar que, lo primero que me viene... Novias YolanCris Yo soy de las que piensan  que hay un vestido para cada Novia, algo as� como el gran refr�n de �Siempre hay un roto para un descosido�.  Cada una de... Una Novia diferente. Una Novia Jordi Dalmau Cada vez son m�s las Novias que desean innovar y sorprender en su Boda, y no solo en la decoraci�n o en la celebraci�n sino, tambi�n, en su propio look... \n \n \n Posted in Dise�adores, Paula del Vas | Tags: dise�adora, moda nupcial, paula del vas, vestido novia Share on facebook Share on twitter Share on email Share on print More Sharing Services", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]"));
		selenium.click("link=Una Novia diferente. Una Novia Jordi Dalmau");
		selenium.waitForPageToLoad("30000");
		verifyEquals("En este art�culo os voy a hablar de un dise�ador que rompe con todo clasicismo en sus dise�os, llegando a saltarse tradiciones tan arraigadas como el propio color del vestido: Jordi Dalmau.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[3]"));
		selenium.click("link=Otros regalos especiales para invitados");
		selenium.waitForPageToLoad("30000");
		verifyEquals("A continuaci�n os doy algunas ideas:", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[2]"));
		verifyEquals("A las pr�ximas parejas en casarse:", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[5]/strong"));
		selenium.click("link=Entrevista y Sorteo con la fot�grafa To�i Olalla");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Como sorpresa y agradecimiento a nuestros seguidores hemos organizado un Sorteo LOVE donde todas las parejas puedan participar (casadas y no casadas!!). El sorteo esta abierta hasta el 14 de septiembre y el ganador se anunciara el d�a de nuestra boda: 21 de septiembre!! Para participar os dirijo al Sorteo aqu�.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[4]"));
		selenium.click("link=Novias YolanCris");
		selenium.waitForPageToLoad("30000");
		verifyEquals("En este art�culo os voy a hablar de una marca que cada vez me gusta m�s: YolanCris. Cuanto m�s veo sus colecciones m�s me sorprende, ya que, todos sus modelos comparten un estilo, pero consiguen ser muy diferentes entre s�.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[3]"));
		selenium.click("link=NOVIAS �PRONOVIAS Y MUCHO MAS�");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Pero, PRONOVIAS va m�s all�. Tiene un gran n�mero de marcas, tanto de trajes de Novia como de fiesta y complementos. Firmas como St.Patrick,  La Sposa, White One, E L I E by Elie Saab y Avenue Diagonal, completan este gran grupo. A continuaci�n os voy a dejar con una peque�a muestra de estas firmas, ver�is que siguen la misma l�nea, Novias Modernas y atrevidas, a la par que so�adoras y elegantes.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[4]"));
		selenium.click("link=6 Plantillas chulas para las etiquetas de tus regalos de boda.");
		selenium.waitForPageToLoad("30000");
		verifyEquals("A continuaci�n os dejamos 6 plantillas para que vosotros mismos hag�is las etiquetas de los regalos de boda.", selenium.getText("css=div.postcontent > p"));
		selenium.click("css=div.alignleft > a");
		selenium.waitForPageToLoad("30000");
		verifyEquals("DALIAS DE ARROZ", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/h3[2]/strong"));
		selenium.click("link=Grande en cada detalle. Plantillas para el men� de la boda.");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Se trata de algo que pocas veces tenemos en cuenta, sobre todo porque en la mayor�a de los lugares donde se celebran los banquetes de boda son ellos los que dan las opciones para las tarjetas de men� (normalmente existe una �nica tarjeta de men� a la que s�lo cambian los datos). Una opci�n mucho mejor es hacerlas vosotros mismos. Si lo ten�is en cuenta, puede ser un recuerdo que todos vuestros invitados se lleven, as� que intentad hacerlo con cari�o.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/p[2]"));
		selenium.click("link=Kit de emergencia para el d�a de la boda");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Es muy probable que no necesites nada de todo esto, o que, aunque lo necesitaras, no est�s pendiente de retocarte el mo�o o el ojo, pero el simple hecho de saber que lo tienes te dar� mucha tranquilidad.", selenium.getText("css=h6"));
		selenium.click("link=Invitaciones f�ciles");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Con la perforadora de borde, hacemos el dibujo. Si no tenemos perforadora se puede cortar con una tijera de dibujo, m�s o menos, a 1 cm del borde.", selenium.getText("//div[@id='main']/div/div[10]/div[3]/div/div[2]/div[3]/div[10]/div/div[2]/div[21]"));
		selenium.click("link=10 Consejos para elegir tu traje de novio");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Esconder tus defectos.", selenium.getText("css=blockquote > p"));
		selenium.click("link=Como hacer jabones de glicerina para tu boda");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Arroz de colores");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Arroz de colores", selenium.getText("link=Arroz de colores"));
		selenium.click("link=Consejos para elegir alianza de boda");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Consejos para elegir alianza de boda", selenium.getText("link=Consejos para elegir alianza de boda"));
		selenium.click("link=8 Consejos para elegir el mejor veh�culo para tu boda");
		selenium.waitForPageToLoad("30000");
		verifyEquals("8 Consejos para elegir el mejor veh�culo para tu boda", selenium.getText("link=8 Consejos para elegir el mejor veh�culo para tu boda"));
		selenium.click("link=Plantillas para dar una tarjeta con los alfileres de la novia");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Plantillas para dar una tarjeta con los alfileres de la novia", selenium.getText("link=Plantillas para dar una tarjeta con los alfileres de la novia"));
		selenium.click("link=Tratamientos de belleza");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Tratamientos de belleza", selenium.getText("link=Tratamientos de belleza"));
		verifyEquals("Empieza a buscar vestido- algunas direcciones", selenium.getText("link=Empieza a buscar vestido- algunas direcciones"));
		selenium.click("link=Empieza a buscar vestido- algunas direcciones");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Maquillaje de la novia");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Maquillaje de la novia", selenium.getText("link=Maquillaje de la novia"));
		selenium.click("link=Consejos para elegir el peinado");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Consejos para elegir el peinado", selenium.getText("link=Consejos para elegir el peinado"));
		selenium.click("link=Rosmelia como ramo de novia");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Rosmelia como ramo de novia", selenium.getText("link=Rosmelia como ramo de novia"));
		selenium.click("link=Elegir el ramo de novia");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Elegir el ramo de novia", selenium.getText("link=Elegir el ramo de novia"));
		selenium.click("link=Zapatos Pura Lopez");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Zapatos Pura Lopez", selenium.getText("link=Zapatos Pura Lopez"));
		selenium.click("link=Zapatos Rosa Clar�");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Zapatos Rosa Clar�", selenium.getText("link=Zapatos Rosa Clar�"));
		selenium.click("link=Zapatos de Pronovias para tu boda");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Zapatos de Pronovias para tu boda", selenium.getText("link=Zapatos de Pronovias para tu boda"));
		selenium.open("/");
		verifyTrue(selenium.getText("link=Zapatos de novia con color �Te atreves?").matches("^exact:Zapatos de novia con color �Te atreves[\\s\\S]$"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
