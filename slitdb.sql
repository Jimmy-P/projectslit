/*
Author: Nebula Group (Gruppe 7)
Anne Hilde Aadnevik
Adam Ajmi
Maria Fuglemsmo
Kjetil Hoel
Bjørn Erik Vik Olsen
Lani Øvland
*/
 
#create DATABASE slitdb;
#use slitdb;
 
/*
drop table Tilbakemelding;
drop table Ressurs;
drop table Modulbesvarelse;
drop table RessursType;
drop table Bruker;
drop table Laringsmal;
drop table Modul;
*/
 
CREATE TABLE Modul (
    m_ID INT AUTO_INCREMENT PRIMARY KEY,
    m_navn VARCHAR(100) NOT NULL,
    m_beskrivelse VARCHAR(1000) NOT NULL,
    m_oppgave VARCHAR(1000) NOT NULL
);
 
CREATE TABLE Bruker (
    b_ID INT AUTO_INCREMENT PRIMARY KEY,
    b_fnavn VARCHAR(100) NOT NULL,
    b_enavn VARCHAR(100) NOT NULL,
    b_email VARCHAR(300) NOT NULL,
    b_passord VARCHAR(100) NOT NULL,
    b_type INT NOT NULL
);
 
CREATE TABLE RessursType(
    rt_ID INT AUTO_INCREMENT PRIMARY KEY,
    rt_typenavn VARCHAR(100) NOT NULL
);

CREATE TABLE Laringsmal (
    l_ID INT AUTO_INCREMENT PRIMARY KEY,
    l_tekst VARCHAR(300) NOT NULL,
    m_ID INT NOT NULL,
CONSTRAINT FOREIGN KEY (m_ID) REFERENCES Modul(m_ID)
);
 
CREATE TABLE Modulbesvarelse (
    mb_ID INT AUTO_INCREMENT PRIMARY KEY,
    mb_tidspunkt datetime NOT NULL,
    m_ID INT NOT NULL,
    b_ID INT NOT NULL,
CONSTRAINT FOREIGN KEY (m_ID) REFERENCES Modul(m_ID),
CONSTRAINT FOREIGN KEY (b_ID) REFERENCES Bruker(b_ID)    
);
 
CREATE TABLE Ressurs (
    r_ID INT AUTO_INCREMENT PRIMARY KEY,
    m_ID INT,
    mb_ID INT,
    rt_ID INT NOT NULL,
    r_tekst VARCHAR(1000),
    r_fil BLOB,
CONSTRAINT FOREIGN KEY (m_ID) REFERENCES Modul(m_ID),
CONSTRAINT FOREIGN KEY (mb_ID) REFERENCES Modulbesvarelse(mb_ID),  
CONSTRAINT FOREIGN KEY (rt_ID) REFERENCES RessursType(rt_ID)    
);
 
CREATE TABLE Tilbakemelding (
    tm_ID INT AUTO_INCREMENT PRIMARY KEY,
    tm_godkjentstatus TINYINT NOT NULL,
    tm_dato DATETIME,
    tm_studentkommentar VARCHAR(1000),
    tm_larerkommentar VARCHAR(1000),
    m_ID INT NOT NULL,
    b_ID INT NOT NULL,
CONSTRAINT FOREIGN KEY (m_ID) REFERENCES Modul(m_ID),
CONSTRAINT FOREIGN KEY (b_ID) REFERENCES Bruker(b_ID)
);
 
 
 
#SELECT * FROM Modul;
INSERT INTO Modul VALUES (NULL, 'Modul 1', 'Primitive typer', 'Skriv kode som bruker minst 3 forskjellige primitive typer');
INSERT INTO Modul VALUES (NULL, 'Modul 2', 'Klasser og objekter', 'Skriv kode som lager flere objekter av samme klasse');
INSERT INTO Modul VALUES (NULL, 'Modul 3', 'Metoder', 'Skriv kode som bruker flere metoder');
INSERT INTO Modul VALUES (NULL, 'Modul 4', 'Enkelt program', 'Skriv kode som bruker elementer fra alle de tidligere modulene');
INSERT INTO Modul VALUES (NULL, 'Modul 5', 'Vanskelige program', 'Skriv kode som bruker elementer fra alle de tidligere modulene og litt til');


#SELECT * FROM Laringsmal;
INSERT INTO Laringsmal VALUES (NULL, 'Lær å lage et objekt', 2);
INSERT INTO Laringsmal VALUES (NULL, 'Skriv en klasse', 2);
INSERT INTO Laringsmal VALUES (NULL, 'Vite forskjellen på primitive typer', 1);
INSERT INTO Laringsmal VALUES (NULL, 'Kompilere kode', 1);
INSERT INTO Laringsmal VALUES (NULL, 'kan forklare hva som menes med abstraksjon og modularisering', 3);
INSERT INTO Laringsmal VALUES (NULL, 'kan bruke debuggeren i BlueJ', 3);
INSERT INTO Laringsmal VALUES (NULL, 'vet når du trenger samlinger av objekter', 4);
INSERT INTO Laringsmal VALUES (NULL, 'kan bruke klassen ArrayList', 4);
 
 
INSERT INTO Bruker VALUES (NULL, 'Per', 'Olsen', 'polsen@online.no', 'hunter2', 3);
INSERT INTO Bruker VALUES (NULL, 'Ole', 'Olsen', 'oolsen@online.no', 'passord', 3);
INSERT INTO Bruker VALUES (NULL, 'Per', 'Ulv', 'wiley@coyote.com', 'IHateRoadRunners', 3);
INSERT INTO Bruker VALUES (NULL, 'Nils', 'Hansen', 'nilsern@hotmail.com', 'test123', 3);
INSERT INTO Bruker VALUES (NULL, 'Torbjørn', 'Hovstad', 'tohov@online.no', 'sdtfn58', 3);
INSERT INTO Bruker VALUES (NULL, 'Hans', 'Nilsen', 'han@gmail.com', 'jaujau', 3);
INSERT INTO Bruker VALUES (NULL, 'Hallgeir', 'Nilsen', 'nilzmedskillz@uia.no', 'ILoveJava', 1);
 
 
INSERT INTO RessursType VALUES (NULL, 'Fil');
INSERT INTO RessursType VALUES (NULL, 'PDF');
INSERT INTO RessursType VALUES (NULL, 'URL');
 
 
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-10-11 16:35:22', 1, 1);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-10-11 13:36:52', 1, 2);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-10-11 14:15:12', 1, 3);

INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 16:15:12', 2, 1);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 17:15:12', 2, 2);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 18:15:12', 2, 3);

INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 18:15:12', 3, 1);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 19:15:12', 3, 2);

INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 15:16:12', 4, 1);
INSERT INTO ModulBesvarelse VALUES (NULL, '2016-11-11 15:15:12', 4, 2);
 
 
INSERT INTO Ressurs VALUES (NULL, 1, 1, 1, 'Dette er en flott ressurs!', NULL);
INSERT INTO Ressurs VALUES (NULL, 2, 2, 2, NULL, NULL);
INSERT INTO Ressurs VALUES (NULL, 3, 3, 3, NULL, NULL);
INSERT INTO Ressurs VALUES (NULL, 3, 5, 3, NULL, NULL);
 
 
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-11 15:15:12', 'Helt ok', 'Ganske dårlig egentlig', 1, 1);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-12 15:15:12', 'Svakt', 'Dårlig', 1, 2);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-13 15:15:12', 'Bra', 'Helt greit', 1, 3);

INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-14 15:15:12', 'Utmerket', 'Bra', 2, 1);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-15 15:15:12', 'Greit', 'Bra', 2, 2);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-16 15:15:12', 'Ok', 'Bra', 2, 3);

INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-17 15:15:12', 'Øv mer', 'Ikke så bra', 3, 1);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-19 15:15:12', 'Utmerket', 'Bra', 3, 2);
INSERT INTO Tilbakemelding VALUES (NULL, 0, '2016-11-18 15:15:12', 'Se over på ny', 'Dårlig', 4, 2);
INSERT INTO Tilbakemelding VALUES (NULL, 1, '2016-11-19 16:15:12', 'Ok', 'Bra', 4, 1);