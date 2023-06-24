
//this is a commit from Hassen  

include<iostream>
#include<fstream>
#include<string>
#include<windows.h>     // for decoring use sleep

#include <stdlib.h>    //for  clearing the screen
#include <iomanip>     //for maupulating input output setw()
using namespace std;
struct abc
{
	string model,pcountry,ftype,color;
	string price,hpower,pyear,row;
};
void entry();
void show();
void edit();
void dele();
void loading();
int linecounter();
void stake();

int main()
{
	system("color e");
	
		cout << "                                             MAY BE CAR SELLING COMPANY"<< endl;

	cout << "                                                    _..---------++._" << endl;
	cout << "                                               _.-'/ |      _||  \ ''--._" << endl;
	cout << "                                        __.--'`._/_\j_____/_||___\       `----." << endl;
	cout << "                                   _.--'_____    |          \     _____      /" << endl;
	cout << "                                 _j    /,---.\   |        =o |   /,---.\      |_" << endl;
	cout << "                                [__]==// .-. \\==`===========/==// .-. \\====[__]" << endl;
	cout << "                                   `-._|\ `-' /|___\________/_____|\ `-' /|_.'     " << endl;
	cout << "                                        `---'                    `---'" << endl;
	cout<<"\t\t\t1: to show the database\n\t\t\t2: to entry new car\n\t\t\t3: to edit from the database\n\t\t\t4: to delete from the database\n\t\t\t5: show the stakeholder(group member)\n\t\t\t6: exit"<<endl;
int x;
cout<<"ENTER YOUR CHOICE"<<endl;
cin>>x;
if(x==1)
{
	show();
}
if(x==2)
{
	entry();
}
if(x==3)
{
	edit();
}
if(x==4)
{
	dele();
}
if(x==5)
{
stake();	
}
if(x==6)
{
	
}
}

//  COMMIT BY  EYOB CHIKSA 
void entry()
{
	system("cls");
loading();
	cout<<"enter the number of car you enter ";
	int a;
	cin>>a;
	abc c[a];
 	
	ofstream in("eyus.txt", ios::app);
	for(int i=0;i<a;i++)
	{
		cout<<"   enter "<<i+1<<" row data"<<endl;
       cout<<"enter the car model : ";
	   cin>>c[i].model;
	   in<<c[i].model<<",";
	   cout<<"enter the product country :";
	   cin>>c[i].pcountry;
	   in<<c[i].pcountry<<",";
	   cout<<"enter the fuel type : ";
	   cin>>c[i].ftype;
	   in<<c[i].ftype<<",";
	   cout<<"enter the color of the car :";
	   cin>>c[i].color;
	   in<<c[i].color<<",";
	   cout<<"enter the price : ";
	   cin>>c[i].price;
	   in<<c[i].price<<",";
	   cout<<"enter the horse power : ";
	   cin>>c[i].hpower;
	   in<<c[i].hpower<<",";
	   cout<<"enter the production year : ";
	   cin>>c[i].pyear;
	   in<<c[i].pyear<<","<<"\n";
	   	cout<<endl;
	}
	in.close();
	cout<<"  data entered sucsessfully\n";
	cout<<"enter any key to return back";
cin.ignore();
cin.get();
system("cls");
main();
	}