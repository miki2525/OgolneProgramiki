#include <stdio.h>
#include <conio.h>
#include <unistd.h>


int main (void)
{	
	/*char n[4] = "Miki";*/
	int m;
	char imie[20];
	int k, x, y, z;
	
	printf("\n\t\t\tElo, podaj imie: ");
	scanf("%s", &imie);
	printf(" Siema %s!\n\n Odpaliles(las) plik z zabawa pt. \"nie daj sie oszukac przez Czoko\"\n\n Wyobraz sobie szklanke, w ktorej znajduja sie cukierki czekoladowe \"Czoko\" oraz papryczka chili.\n Bedziesz mierzyl sie z przeciwnikiem o imieniu CPU. Twoim zadaniem jest wyciagniecie takiej ilosci Czoko, by w szklance pozostala tylko papryczka chili.\n\n W jednym ruchu mozesz wyjac 1, 2 lub 3 cukierki Czoko. Ten Gracz, ktoremu zostanie tylko chili do wyciagniecia, PRZEGRYWA(= L O O S E R)\n\n W szklance jest 13 Czoko + papryczka chili\n\n CPU jest gospodarzem pojedynku wiec on bedzie zaczynal\n\n", imie);
	
	/*szklana*/
	printf (" #\t\t#\n");	
	printf (" #\t\t#\n");	
	printf (" #     CHOKO    #\n");
	printf (" #     GLASS    #\n");
	printf (" #\t\t#\n");
	for (int i = 0; i<7; i++)
	{
	printf (" #\t\t#\n");
	}
	printf(" #%%%%%%%%%\t\t#\n");
	printf(" #%%%%%%%%%\t\t#\n");
	printf(" #%%%%%%%%%%%\t\t#\n");
	printf(" #%$$$$$$===>\t#\n");
	printf(" ################\n\n\n");
	printf("\tlegenda: \n # - kontury szklanki\n %% - cukierki Czoko\n $ - papryczka chili z ogonkiem");
	
	printf("\t\t\t\t\t\tnacisnij dowolny przycisk by zaczac\n\n");
	getch();




	printf("jestes juz gotow??\n to na co czekasz?! aby rozpoczac oblicz \"x\" z rownania 2*x+2=25+x, potwierdz przyciskiem ENTER i wygraj z CPU!\n");

wynik:
	scanf("%d", &m);
	if (m == 23)
	{
		printf("\t\t\t\t$$$$$$ Access SUCCESS $$$$$$ POWODZENIA!!\n\n\n");
		
	}
	else 
	{ 
	printf("\t\t\t\t$$$$$$ Access DENIED $$$$$$ sprobuj ponownie\n");
	goto wynik;
}



	sleep(2);
	
for(z=5; z>0; z--){
  printf("\t\t\t\t\t\t");
  printf("%d\n\n", z);
  sleep(1);
 }
 
 printf("\t\tCPU rozpoczyna rozrywke!");
 printf("\n==============================");
 printf("\t\tCPU mysli");
 for(k=3; k>0; k--){
 	printf(".");
 sleep(1);
 }
 
 
 printf("\n\n\tCPU wzial 1 Czoko!\n Pozostalo: 12 Czoko + chili\n");
 sleep(3);
 printf("\n==============================\t\tTwoja kolej!\n\n");
 sleep(2);
 
 x = 12;
 while (x > 0){
 	printf("ile wezmiesz Czoko? (podaj cyfre od 1 do 3 i zatwierdz przyciskiem ENTER)\n\t");
 	nalepka:
	 scanf("%d", &y); 
	 if (y == 1 || y == 2 || y == 3){
	sleep(2);
 	printf("\tWziales %d Czoko\n Pozostalo: %d Czoko + chili\n",y, x-y);}
 	 else{
	printf("\n\tPodaj cyfre od 1 do 3\n");
	goto nalepka; }
 	
 	
	sleep(3);
	printf("\n==============================\t\tKolej na CPU");
	sleep(1.5);
	printf("\tCPU mysli");
	for(k=5; k>0; k--){
 	printf(".");
 sleep(1);
 }
 printf("\n\n\tCPU wzial %d Czoko!\n Pozostalo: %d Czoko + chili\n", 4-y, x-4);
 
 x = x - 4;
 sleep(3);
 
 if (x > 0){
 printf("\n==============================\t\tTwoja kolej!\n\n");}
}
 printf ("Przegrales\n");
 printf("\n\t\t\t==============================L=O=O=S=E=R==============================");
 printf("\njesli chcesz rewanzu, wcisnij \"d\" i odpal program ponownie");
 while (getchar()!= 'd');
	}
