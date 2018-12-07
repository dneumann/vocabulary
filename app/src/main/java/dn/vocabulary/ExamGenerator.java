package dn.vocabulary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamGenerator {

    private List<Vocab> vocabs = new ArrayList<>();

    public List<Vocab> getExam(String number, boolean randomize) {

        if ("Unit1chaos".equals(number)) {
            vocabs.add(new Vocab("Chaos", "chaos"));
            vocabs.add(new Vocab("Laden an der Ecke", "corner shop"));
            vocabs.add(new Vocab("Meister/in", "master"));
            vocabs.add(new Vocab("Joghurt", "yoghurt"));
            vocabs.add(new Vocab("klein", "little"));
            vocabs.add(new Vocab("immer", "always"));
            vocabs.add(new Vocab("eine Gruppe Mädchen", "a group of girls"));
            vocabs.add(new Vocab("die Gruppe (dort)", "that group"));
            vocabs.add(new Vocab("schwimmen", "swim"));
            vocabs.add(new Vocab("wie Jungen", "like boys"));
            vocabs.add(new Vocab("Schwimmer/in", "swimmer"));
            vocabs.add(new Vocab("gut sein in Kung-Fu", "be good at kung fu"));
            vocabs.add(new Vocab("Bist du gut in Fußball?", "Are you good at football?"));
            vocabs.add(new Vocab("Gefühl", "feeling"));
            vocabs.add(new Vocab("wütend", "angry"));
            vocabs.add(new Vocab("glücklich", "happy"));
            vocabs.add(new Vocab("überrascht", "surprised"));
            vocabs.add(new Vocab("vorspielen", "act out"));
            vocabs.add(new Vocab("das nächste Bild", "the next picture"));
            vocabs.add(new Vocab("die nächste Frage", "the next question"));
            vocabs.add(new Vocab("Mann", "man"));
            vocabs.add(new Vocab("Männer", "men"));
            vocabs.add(new Vocab("Frau", "woman"));
            vocabs.add(new Vocab("Frauen", "women"));






        } else if ("Norik1".equals(number)) {
            vocabs.add(new Vocab("stressig", "stressful"));
            vocabs.add(new Vocab("ausgesprochen", "highly"));
            vocabs.add(new Vocab("spezialisiert", "specialised"));
            vocabs.add(new Vocab("befriedigend", "rewarding"));
            vocabs.add(new Vocab("gut bezahlt", "well-paid"));
            vocabs.add(new Vocab("schlecht bezahlt", "badly-paid"));
            vocabs.add(new Vocab("studieren", "study"));
            vocabs.add(new Vocab("Ausbildung", "apprenticeship"));
            vocabs.add(new Vocab("Segel", "sail"));
            vocabs.add(new Vocab("zusammenfassen", "sum up"));
            vocabs.add(new Vocab("Eisbergschieber", "iceberg mover"));
            vocabs.add(new Vocab("Geiger", "violinist"));
            vocabs.add(new Vocab("sich spezialisieren auf", "specialise in"));
            vocabs.add(new Vocab("Violine", "violin"));
            vocabs.add(new Vocab("Bogen", "bow"));
            vocabs.add(new Vocab("Kunstschule", "art school"));
            vocabs.add(new Vocab("sondern", "but"));
            vocabs.add(new Vocab("weitergehen", "move on"));
            vocabs.add(new Vocab("Akademie", "academy"));
            vocabs.add(new Vocab("Bildhauer", "sculptor"));
            vocabs.add(new Vocab("Performancekünstler", "performance artist"));
            vocabs.add(new Vocab("U-Bahn", "subway"));
            vocabs.add(new Vocab("Tafel", "panel"));
            vocabs.add(new Vocab("etwas tun sollen", "be supposed to do something"));
            vocabs.add(new Vocab("faszinierend", "intriguing"));
            vocabs.add(new Vocab("cartoonartig", "cartoon-like"));
            vocabs.add(new Vocab("Ausschau halten nach", "look out for"));
            vocabs.add(new Vocab("Reklamefläche", "space"));
            vocabs.add(new Vocab("ausradieren", "rub out"));
            vocabs.add(new Vocab("verpfuschen", "mess up"));
            vocabs.add(new Vocab("kommunizieren", "communicate"));
            vocabs.add(new Vocab("vertraut", "familiar"));
            vocabs.add(new Vocab("erreichen", "reach"));
            vocabs.add(new Vocab("Baseballkappe", "baseball cap"));
            vocabs.add(new Vocab("billig", "low-cost"));
            vocabs.add(new Vocab("Wandgemälde", "wall painting"));
            vocabs.add(new Vocab("Spanien", "Spain"));
            vocabs.add(new Vocab("Besucher", "visitor"));
            vocabs.add(new Vocab("Dokumentarfilm", "documentary"));
            vocabs.add(new Vocab("veröffentlichen", "release"));
            vocabs.add(new Vocab("Druckerei", "printing shop"));
            vocabs.add(new Vocab("Drucken", "printing"));
            vocabs.add(new Vocab("Design", "designing"));
            vocabs.add(new Vocab("Architekt", "architect"));
            vocabs.add(new Vocab("Visitenkarte", "business card"));
            vocabs.add(new Vocab("höflich", "polite"));
            vocabs.add(new Vocab("Patrone", "cartridge"));
            vocabs.add(new Vocab("Druckmaschine", "printing machine"));
            vocabs.add(new Vocab("Maske", "mask"));
            vocabs.add(new Vocab("fein", "fine"));
            vocabs.add(new Vocab("Teilchen", "particle"));
            vocabs.add(new Vocab("Telefonanruf", "telephone call"));
            vocabs.add(new Vocab("Telefongespräch", "telephone conversation"));
            vocabs.add(new Vocab("awful", "schrecklich"));
            vocabs.add(new Vocab("erfordern", "take"));
            vocabs.add(new Vocab("sich bewerben um", "apply for"));
        } else if ("Norik2".equals(number)) {
            vocabs.add(new Vocab("Arbeitgeber", "employer"));
            vocabs.add(new Vocab("persönliche Kompetenzen", "soft skill"));
            vocabs.add(new Vocab("berufstypische Qualifikationen", "hard skill"));
            vocabs.add(new Vocab("bestimmt", "particular"));
            vocabs.add(new Vocab("auflisten", "list"));
            vocabs.add(new Vocab("Maschineschreiben", "typing"));
            vocabs.add(new Vocab("Programmieren", "programming"));
            vocabs.add(new Vocab("Erfahrung", "experience"));
            vocabs.add(new Vocab("Computerprogramm", "program"));
            vocabs.add(new Vocab("Persönlichkeit", "personality"));
            vocabs.add(new Vocab("Haltung", "attitude"));
            vocabs.add(new Vocab("Verhalten", "manner"));
            vocabs.add(new Vocab("Höflichkeit", "politeness"));
            vocabs.add(new Vocab("Zuverlässigkeit", "reliability"));
            vocabs.add(new Vocab("Verständigung", "communication"));
            vocabs.add(new Vocab("Fähigkeit", "ability"));
            vocabs.add(new Vocab("sich freiwillig melden", "volunteer"));
            vocabs.add(new Vocab("Sport treiben", "play a sport"));
            vocabs.add(new Vocab("wahrscheinlich", "likely"));
            vocabs.add(new Vocab("Nachbar", "neighbor"));
            vocabs.add(new Vocab("verantwortungsbewusst", "responsible"));
            vocabs.add(new Vocab("Rückmeldung", "feedback"));
            vocabs.add(new Vocab("einen Kurs machen", "take a course"));
            vocabs.add(new Vocab("Bewerbung", "application"));
            vocabs.add(new Vocab("Lebenslauf", "résumé"));
            vocabs.add(new Vocab("Glück", "luck"));
            vocabs.add(new Vocab("Überprüfung", "check"));
            vocabs.add(new Vocab("sich hinsetzen", "sit down"));
            vocabs.add(new Vocab("sich entschuldigen (z)", "apologize"));
            vocabs.add(new Vocab("sich entschuldigen (s)", "apologise"));
            vocabs.add(new Vocab("individuell", "individual"));
            vocabs.add(new Vocab("Schulhof", "playground"));
            vocabs.add(new Vocab("sofort", "immediately"));
            vocabs.add(new Vocab("eindeutig", "definitely"));
            vocabs.add(new Vocab("hier: genau", "carefully"));
            vocabs.add(new Vocab("aufpassen auf", "pay attention to"));
            vocabs.add(new Vocab("Streit", "argument"));
            vocabs.add(new Vocab("friedlich", "peaceful"));
            vocabs.add(new Vocab("Praktikum, Berufserfahrung", "work experience"));
            vocabs.add(new Vocab("Sportgeschäft", "sports shop"));
            vocabs.add(new Vocab("Skateboard fahren", "skateboard"));
            vocabs.add(new Vocab("zeigen", "demonstrate"));
            vocabs.add(new Vocab("Katastrophe", "disaster"));
            vocabs.add(new Vocab("pünktlich", "on time"));
            vocabs.add(new Vocab("wegschicken", "send off"));
            vocabs.add(new Vocab("fegen", "sweep"));
            vocabs.add(new Vocab("Karton", "cardboard box"));
            vocabs.add(new Vocab("Keller", "basement"));
            vocabs.add(new Vocab("Schnürsenkel", "shoelace"));
            vocabs.add(new Vocab("sortieren", "sort"));
            vocabs.add(new Vocab("Laufshirt", "running shirt"));
            vocabs.add(new Vocab("hier: nach", "by"));
            vocabs.add(new Vocab("einschlafen", "fall asleep"));
            vocabs.add(new Vocab("Mittagspause", "lunch break"));
            vocabs.add(new Vocab("überschreiten", "go over"));
            vocabs.add(new Vocab("hier: ausgleichen", "make up"));
            vocabs.add(new Vocab("Registrierkasse", "cash register"));
            vocabs.add(new Vocab("herausziehen", "pull out"));
            vocabs.add(new Vocab("eine SMS schreiben", "text"));
            vocabs.add(new Vocab("sich die Zeit vertreiben", "pass the time"));
            vocabs.add(new Vocab("erscheinen", "appear"));
            vocabs.add(new Vocab("aus dem Nichts", "from nowhere"));
            vocabs.add(new Vocab("herumsitzen", "sit around"));
            vocabs.add(new Vocab("Besorgungsliste", "to-do list"));
            vocabs.add(new Vocab("Lagerraum", "storeroom"));
            vocabs.add(new Vocab("wirksam", "effective"));
            vocabs.add(new Vocab("genau", "precise"));
            vocabs.add(new Vocab("Absatz", "paragraph"));
            vocabs.add(new Vocab("unterstreichen", "underline"));
            vocabs.add(new Vocab("Überschrift", "heading"));
            vocabs.add(new Vocab("überladen", "overload"));
            vocabs.add(new Vocab("Kolumbien", "Columbia"));
            vocabs.add(new Vocab("zukünftig", "future"));
            vocabs.add(new Vocab("drinnen", "indoors"));
            vocabs.add(new Vocab("draußen", "outdoors"));
            vocabs.add(new Vocab("regelmäßig", "regular"));
            vocabs.add(new Vocab("Arbeitszeiten", "working hours"));



        } else if ("Unit1".equals(number)) {
            vocabs.add(new Vocab("in der Schule", "at school"));
            vocabs.add(new Vocab("Kind, Jugendlicher", "kid"));
            vocabs.add(new Vocab("ihr bester Freund", "her best friend"));
            vocabs.add(new Vocab("sie sind (short)", "they're"));
            vocabs.add(new Vocab("sie sind (long)", "they are"));
            vocabs.add(new Vocab("Wohnung", "flat"));
            vocabs.add(new Vocab("neu", "new"));
            vocabs.add(new Vocab("Schuluniform", "uniform"));
            vocabs.add(new Vocab("nett, schön", "nice"));
            vocabs.add(new Vocab("auch", "too"));
            vocabs.add(new Vocab("wissen, kennen", "know"));
            vocabs.add(new Vocab("Bruder", "brother"));
            vocabs.add(new Vocab("Schwester", "sister"));
            vocabs.add(new Vocab("Schüler, Schülerin", "student"));
            vocabs.add(new Vocab("aber", "but"));
            vocabs.add(new Vocab("er ist nicht (short)", "he isn't"));
            vocabs.add(new Vocab("er ist nicht (long)", "he is not"));
            vocabs.add(new Vocab("seine Mama", "his mum"));
            vocabs.add(new Vocab("Mutter", "mother"));
            vocabs.add(new Vocab("Papa, Vati", "dad"));
            vocabs.add(new Vocab("Vater", "father"));
            vocabs.add(new Vocab("Marine", "navy"));
            vocabs.add(new Vocab("anschauen", "look at"));
            vocabs.add(new Vocab("dunkel", "dark"));
            vocabs.add(new Vocab("bitte", "please"));
            vocabs.add(new Vocab("Du bist spät dran. (short)", "You're late."));
            vocabs.add(new Vocab("warten auf", "wait for"));
            vocabs.add(new Vocab("Minute", "minute"));
            vocabs.add(new Vocab("Wie spät ist es?", "What time is it?"));
            vocabs.add(new Vocab("Bibliothek", "library"));
            vocabs.add(new Vocab("Heim, Zuhause", "home"));
        } else if ("Unit1a".equals(number)) {
            vocabs.add(new Vocab("vor der Schule", "before school"));
            vocabs.add(new Vocab("du bist nicht (short)", "you aren't"));
            vocabs.add(new Vocab("du bist nicht (long)", "you are not"));
            vocabs.add(new Vocab("da, dahin", "there"));
            vocabs.add(new Vocab("traurig", "sad"));
            vocabs.add(new Vocab("Geh nicht. (short)", "Don't go."));
            vocabs.add(new Vocab("tschüs", "bye"));
            vocabs.add(new Vocab("Pass auf!", "Watch out!"));
            vocabs.add(new Vocab("Tut mir leid. (short)", "I'm sorry."));
            vocabs.add(new Vocab("Na und?", "So?"));
            vocabs.add(new Vocab("Freut mich, dich kennenzulernen.", "Nice to meet you."));
            vocabs.add(new Vocab("sich beeilen", "hurry up"));
            vocabs.add(new Vocab("wer?", "who?"));
            vocabs.add(new Vocab("freundlich", "friendly"));
            vocabs.add(new Vocab("Schuh", "shoe"));
            vocabs.add(new Vocab("Turnschuh", "trainer"));
            vocabs.add(new Vocab("vergessen", "forget"));
            vocabs.add(new Vocab("tragen (Kleidung)", "wear"));
            vocabs.add(new Vocab("verschieden, anders", "different"));
            vocabs.add(new Vocab("haben", "have"));
            vocabs.add(new Vocab("Ich mag Grün nicht. (short)", "I don't like green."));
            vocabs.add(new Vocab("Versuch's mal.", "Have a go."));
            vocabs.add(new Vocab("Sprache", "language"));
            vocabs.add(new Vocab("von", "of"));
            vocabs.add(new Vocab("Leute", "people"));
            vocabs.add(new Vocab("albern, blöd", "silly"));
            vocabs.add(new Vocab("Satz", "sentence"));
            vocabs.add(new Vocab("Hilfe", "help"));
            vocabs.add(new Vocab("helfen", "help"));
            vocabs.add(new Vocab("Sprecher", "speaker"));
            vocabs.add(new Vocab("sprechen", "speak"));
            vocabs.add(new Vocab("über mich", "about me"));
            vocabs.add(new Vocab("um 1 Uhr", "at 1 o'clock"));
            vocabs.add(new Vocab("Verabredung", "appointment"));
        } else if ("Unit1b".equals(number)) {
            vocabs.add(new Vocab("Frau Bell", "Miss Bell"));
            vocabs.add(new Vocab("Guten Morgen.", "Good morning."));
            vocabs.add(new Vocab("also, deshalb, daher", "so"));
            vocabs.add(new Vocab("hereinkommen", "come in"));
            vocabs.add(new Vocab("anfangen, beginnen", "start"));
            vocabs.add(new Vocab("Ball", "ball"));
            vocabs.add(new Vocab("werfen", "throw"));
            vocabs.add(new Vocab("fragen", "ask"));
            vocabs.add(new Vocab("fangen", "catch"));
            vocabs.add(new Vocab("antworten", "answer"));
            vocabs.add(new Vocab("Antwort", "answer"));
            vocabs.add(new Vocab("über dich selbst", "about yourself"));
            vocabs.add(new Vocab("Geburtstag", "birthday"));
            vocabs.add(new Vocab("machen, tun", "do"));
            vocabs.add(new Vocab("leben, wohnen", "live"));
            vocabs.add(new Vocab("in der Deanstraße 14", "at 14 Dean Street"));
            vocabs.add(new Vocab("dann", "then"));
            vocabs.add(new Vocab("wieder, noch einmal", "again"));
            vocabs.add(new Vocab("Stundenplan", "timetable"));
            vocabs.add(new Vocab("Viertel nach zehn", "quarter past ten"));
            vocabs.add(new Vocab("halb elf", "half past ten"));
            vocabs.add(new Vocab("Viertel vor elf", "quarter to eleven"));
            vocabs.add(new Vocab("Schulfach", "school subject"));
            vocabs.add(new Vocab("Kunst", "art"));
            vocabs.add(new Vocab("Design und Technik", "design and technology"));
            vocabs.add(new Vocab("Französisch", "French"));
            vocabs.add(new Vocab("Geografie", "geography"));
            vocabs.add(new Vocab("Geschichte", "history"));
            vocabs.add(new Vocab("I. und K.", "ICT"));
            vocabs.add(new Vocab("Mathematik", "maths"));
            vocabs.add(new Vocab("Musik", "music"));
            vocabs.add(new Vocab("Sportunterricht", "PE"));
            vocabs.add(new Vocab("Religion", "religion"));
            vocabs.add(new Vocab("Naturwissenschaft", "science"));
            vocabs.add(new Vocab("Stunde", "hour"));
            vocabs.add(new Vocab("Mittagessen", "lunch"));
            vocabs.add(new Vocab("Pause", "break"));
            vocabs.add(new Vocab("lernen", "learn"));
            vocabs.add(new Vocab("Monat", "month"));
            vocabs.add(new Vocab("Januar", "January"));
            vocabs.add(new Vocab("Februar", "February"));
            vocabs.add(new Vocab("März", "March"));
            vocabs.add(new Vocab("September", "September"));
            vocabs.add(new Vocab("April", "April"));
            vocabs.add(new Vocab("Mai", "May"));
            vocabs.add(new Vocab("Juni", "June"));
            vocabs.add(new Vocab("Juli", "July"));
            vocabs.add(new Vocab("August", "August"));
            vocabs.add(new Vocab("Oktober", "October"));
            vocabs.add(new Vocab("November", "November"));
            vocabs.add(new Vocab("Dezember", "December"));
            vocabs.add(new Vocab("zweite", "second"));
            vocabs.add(new Vocab("dritte", "third"));
            vocabs.add(new Vocab("wann?", "when?"));
            vocabs.add(new Vocab("schreiben", "write"));
            vocabs.add(new Vocab("erste", "first"));
            vocabs.add(new Vocab("vierte", "fourth"));
            vocabs.add(new Vocab("fünfte", "fifth"));
            vocabs.add(new Vocab("erste (mit Zahl)", "1st"));
            vocabs.add(new Vocab("zweite (mit Zahl)", "2nd"));
            vocabs.add(new Vocab("dritte (mit Zahl)", "3rd"));
            vocabs.add(new Vocab("vierte (mit Zahl)", "4th"));
            vocabs.add(new Vocab("fünfte (mit Zahl)", "5th"));
        } else if ("Unit1c".equals(number)) {
            vocabs.add(new Vocab("finden", "find"));
            vocabs.add(new Vocab("Gibt es (irgendwelche)...?", "Are there any...?"));
            vocabs.add(new Vocab("buchstabieren", "spell"));
            vocabs.add(new Vocab("arbeiten", "work"));
            vocabs.add(new Vocab("lesen", "read"));
            vocabs.add(new Vocab("anschauen, beobachten", "watch"));
            vocabs.add(new Vocab("einschlafen", "fall asleep"));
            vocabs.add(new Vocab("Ort, Platz, Stelle", "place"));
            vocabs.add(new Vocab("dieser Ort", "this place"));
            vocabs.add(new Vocab("diese Pause", "this break"));
            vocabs.add(new Vocab("dieses Fach", "this subject"));
            vocabs.add(new Vocab("Ich weiß (es) nicht", "I don't know"));
            vocabs.add(new Vocab("Welche Farbe...?", "What colour...?"));
            vocabs.add(new Vocab("Kantine, (Schul-)Mensa", "canteen"));
            vocabs.add(new Vocab("Turnhalle", "gym"));
            vocabs.add(new Vocab("Wir sind fertig.", "We're finished."));
            vocabs.add(new Vocab("zurück", "back"));
            vocabs.add(new Vocab("wir können nicht...", "we can't..."));
            vocabs.add(new Vocab("gewinnen", "win"));
            vocabs.add(new Vocab("ihn, ihm", "him"));
            vocabs.add(new Vocab("Gewinner/in, Sieger/in", "winner"));
            vocabs.add(new Vocab("Alltags-", "everyday"));
            vocabs.add(new Vocab("Arbeitsheft", "workbook"));
            vocabs.add(new Vocab("Seite", "page"));
            vocabs.add(new Vocab("Toilette", "toilet"));
            vocabs.add(new Vocab("Was haben wir als Hausaufgabe auf?", "What's for homework?"));
            vocabs.add(new Vocab("Hausaufgabe(n)", "homework"));
            vocabs.add(new Vocab("Es gibt/sind keine...", "There aren't any..."));
            vocabs.add(new Vocab("auf Deutsch", "in German"));
            vocabs.add(new Vocab("auf Englisch", "in English"));
        } else if ("Unit1Sentences1".equals(number)) {
            vocabs.add(new Vocab("Ich bin nicht zu Hause. (short)", "I'm not at home."));
            vocabs.add(new Vocab("Ich bin in der Schule. (long)", "I am at school."));
            vocabs.add(new Vocab("Wo bin ich? (long)", "Where am I?"));
            vocabs.add(new Vocab("Du bist nicht zu Hause. (short)", "You aren't at home."));
            vocabs.add(new Vocab("Du bist in der Schule. (long)", "You are at school."));
            vocabs.add(new Vocab("Bist du in der Schule? (long)", "Are you at school?"));
            vocabs.add(new Vocab("Ja, bin ich. (long)", "Yes, I am."));
            vocabs.add(new Vocab("Nein, bin ich nicht. (short)", "No, I'm not."));
            vocabs.add(new Vocab("Wer bist du? (long)", "Who are you?"));
            vocabs.add(new Vocab("Er ist nicht hier. (long)", "He is not here."));
            vocabs.add(new Vocab("Er ist dort. (long)", "He is there."));
            vocabs.add(new Vocab("Wir sind nicht in der Bibliothek. (long)", "We are not in the library."));
            vocabs.add(new Vocab("Ihr seid zu Hause. (long)", "You are at home."));
            vocabs.add(new Vocab("Seid ihr zu Hause? (long)", "Are you at home?"));
            vocabs.add(new Vocab("Sie sind nicht im Raum. (long)", "They are not in the room."));
        } else if ("Unit1Sentences2".equals(number)) {
            vocabs.add(new Vocab("Es ist zehn Uhr. (short)", "It's ten o'clock."));
            vocabs.add(new Vocab("Viertel nach zehn", "quarter past ten"));
            vocabs.add(new Vocab("zwanzig nach zehn", "twenty past ten"));
            vocabs.add(new Vocab("halb elf", "half past ten"));
            vocabs.add(new Vocab("Viertel vor zehn", "quarter to ten"));
            vocabs.add(new Vocab("fünf vor zehn", "five to ten"));
            vocabs.add(new Vocab("um sieben Uhr", "at seven o'clock"));
            vocabs.add(new Vocab("am 2. April", "on 2nd April"));
            vocabs.add(new Vocab("am 23. Juni", "on 23rd June"));
            vocabs.add(new Vocab("am 21. Juli", "on 21st July"));
            vocabs.add(new Vocab("am 29. Mai", "on 29th May"));
            vocabs.add(new Vocab("am 10. März", "on 10th March"));
        } else if ("Unit1Sentences3".equals(number)) {
            vocabs.add(new Vocab("Gibt es eine Karte im Raum?", "Is there a map in the room?"));
            vocabs.add(new Vocab("Ja, es gibt eine Karte. (long)", "Yes, there is a map."));
            vocabs.add(new Vocab("Ja, gibt es. (eine Karte) (long)", "Yes, there is."));
            vocabs.add(new Vocab("Nein, es gibt keine Karte. (short)", "No, there isn't a map."));
            vocabs.add(new Vocab("Nein, es gibt keine. (Karte) (short)", "No, there isn't."));
            vocabs.add(new Vocab("Gibt es Karten hier?", "Are there any maps here?"));
            vocabs.add(new Vocab("Ja, es gibt viele Karten. (long)", "Yes, there are lots of maps."));
            vocabs.add(new Vocab("Ja, gibt es. (viele Karten) (long)", "Yes, there are."));
            vocabs.add(new Vocab("Nein, es gibt keine Karten. (short)", "No, there aren't any maps."));
            vocabs.add(new Vocab("Nein, es gibt keine. (Karten) (short)", "No, there aren't any."));
        } else if ("Unit1Sentences4".equals(number)) {
            vocabs.add(new Vocab("Ich kann es buchstabieren.", "I can spell it."));
            vocabs.add(new Vocab("Ich kann es nicht buchstabieren.", "I can't spell it."));
            vocabs.add(new Vocab("Kann ich das Fenster öffnen?", "Can I open the window?"));
            vocabs.add(new Vocab("Ja, kannst du.", "Yes, you can."));
            vocabs.add(new Vocab("Ja, kann ich.", "Yes, I can."));
            vocabs.add(new Vocab("Nein, kannst du nicht.", "No, you can't."));
            vocabs.add(new Vocab("Nein, kann ich nicht.", "No, I can't."));
            vocabs.add(new Vocab("Du kannst gehen.", "You can go."));
            vocabs.add(new Vocab("Ihr könnt gehen.", "You can go."));
            vocabs.add(new Vocab("Frau Bell, Sie können gehen.", "Miss Bell, you can go."));
            vocabs.add(new Vocab("Wir können gehen.", "We can go."));
            vocabs.add(new Vocab("Sie kann den Raum nicht finden.", "She can't find the room."));
            vocabs.add(new Vocab("Können wir gehen?", "Can we go?"));
            vocabs.add(new Vocab("Kannst du es buchstabieren?", "Can you spell it?"));
            vocabs.add(new Vocab("Wo kannst du ein Buch lesen?", "Where can you read a book?"));
            vocabs.add(new Vocab("Ich kann einen Bleistift sehen.", "I can see a pencil."));
        } else if ("deutsch1".equals(number)) {
            vocabs.add(new Vocab("lat.: Nomen", "Substantiv"));
            vocabs.add(new Vocab("Was bezeichnen Nomen/Substantive?", "Lebewesen, Dinge und Vorstellungen"));
            vocabs.add(new Vocab("lat.: grammatisches Geschlecht", "Genus"));
            vocabs.add(new Vocab("männliches Genus", "Maskulinum"));
            vocabs.add(new Vocab("weibliches Genus", "Femininum"));
            vocabs.add(new Vocab("sächliches Genus", "Neutrum"));
            vocabs.add(new Vocab("lat.: Begleiter", "Artikel"));
            //vocabs.add(new Vocab("anderes Wort für 'das Meer'", "die See"));
            //vocabs.add(new Vocab("anderes Wort für 'das kleine Gewässer'", "der See"));
            //vocabs.add(new Vocab("anderes Wort für 'das Lenkrad'", "das Steuer"));
            //vocabs.add(new Vocab("anderes Wort für 'die Geldabgabe'", "die Steuer"));
            vocabs.add(new Vocab("lat.: Einzahl", "Singular"));
            vocabs.add(new Vocab("lat.: Mehrzahl", "Plural"));
            vocabs.add(new Vocab("lat.: grammatische Zahl (Plural oder Singular)", "Numerus"));
            vocabs.add(new Vocab("lat.: grammatischer Fall", "Kasus"));
            vocabs.add(new Vocab("Was kann man mit Nomen machen? (lat.)", "deklinieren"));
            vocabs.add(new Vocab("Was kann man mit Nomen machen? (dt.)", "beugen"));
            vocabs.add(new Vocab("lat.: Grundform von Verben", "Infinitiv"));
            vocabs.add(new Vocab("Was kann man mit Verben machen? (lat.)", "konjugieren"));
            vocabs.add(new Vocab("Was kann man mit Verben machen? (dt.)", "beugen"));
            vocabs.add(new Vocab("Infinitiv von 'ich laufe'", "laufen"));
            vocabs.add(new Vocab("Verben stehen im Infinitiv oder in der", "Personalform"));
            vocabs.add(new Vocab("2. Person Plural von 'laufen'", "ihr lauft"));
            vocabs.add(new Vocab("1. Person Plural von 'laufen'", "wir laufen"));
            vocabs.add(new Vocab("Wortart von 'Beschreiben' (lat.)", "Substantiv"));
            vocabs.add(new Vocab("lat.: Zeitform Zukunft", "Futur"));
            vocabs.add(new Vocab("lat.: Zeitform Gegenwart", "Präsens"));
            vocabs.add(new Vocab("lat.: Zeitform Vergangenheit", "Präteritum"));
            vocabs.add(new Vocab("Welches Verb wird bei Futur benutzt?", "werden"));
            vocabs.add(new Vocab("'gehen': starkes oder schwaches Verb?", "starkes"));
            vocabs.add(new Vocab("'bauen': starkes oder schwaches Verb?", "schwaches"));
            vocabs.add(new Vocab("Personalform von 'wird berichten'", "3. Person Singular"));
            vocabs.add(new Vocab("Wortart von 'guter'", "Adjektiv"));
            vocabs.add(new Vocab("Was kann man mit Adjektiven machen? (dt.)", "steigern"));
            vocabs.add(new Vocab("Steigerungen: Grundstufe, Vergleichsstufe und", "Höchststufe"));
        } else if ("deutsch2".equals(number)) {
            vocabs.add(new Vocab("Kasus von 'den Mann'", "Akkusativ"));
            vocabs.add(new Vocab("Kasus von 'die Frau'", "Nominativ oder Akkusativ"));
            vocabs.add(new Vocab("Kasus von 'der Frau'", "Genitiv oder Dativ"));
            vocabs.add(new Vocab("lat.: Verhältniswort (z. B. in, auf)", "Präposition"));
            vocabs.add(new Vocab("Wortarten von 'spannender Aufsatz'", "Adjektiv und Substantiv"));
            vocabs.add(new Vocab("Wortarten von 'mein Hund'", "Possessivpronomen und Substantiv"));
            vocabs.add(new Vocab("Wortart von 'am'", "Präposition und Artikel"));
            vocabs.add(new Vocab("Was kann man konjugieren?", "Verben"));
            vocabs.add(new Vocab("Personalform von 'er isst'", "3. Person Singular"));
            vocabs.add(new Vocab("Personalform von 'ihr esst'", "2. Person Plural"));
            vocabs.add(new Vocab("Er, ihn, ihm, sie, ihr sind", "Personalpronomen"));
            vocabs.add(new Vocab("Mein, sein, unser, euer sind", "Possessivpronomen"));
            vocabs.add(new Vocab("lat.: Befehlsform", "Imperativ"));
            vocabs.add(new Vocab("Imperativ Singular von 'laufen'", "lauf!"));
            vocabs.add(new Vocab("Imperativ Plural von 'laufen'", "lauft!"));
            vocabs.add(new Vocab("2. Person Plural von 'fahren'", "ihr fahrt"));
            vocabs.add(new Vocab("3. Person Plural von 'fahren'", "sie fahren"));
            vocabs.add(new Vocab("Genus von 'die Betten'", "Neutrum"));
            vocabs.add(new Vocab("Numerus von 'die Betten'", "Plural"));
            vocabs.add(new Vocab("Singular von 'die Lexika'", "das Lexikon"));
            vocabs.add(new Vocab("Plural von 'der Wecker'", "die Wecker"));
            vocabs.add(new Vocab("Wortart von 'heute'", "Adverb"));
            vocabs.add(new Vocab("Kasus von 'den Kindern'", "Dativ"));
            vocabs.add(new Vocab("Numerus von 'den Kindern'", "Plural"));
            vocabs.add(new Vocab("Genus von 'den Kindern'", "Neutrum"));
            vocabs.add(new Vocab("Genus von 'der Schlange'", "Femininum"));
            vocabs.add(new Vocab("Dekliniere 'das Schwein' in den Genitiv", "des Schweins"));
            vocabs.add(new Vocab("Dekliniere 'das Schwein' in den Dativ", "dem Schwein"));
            vocabs.add(new Vocab("Beuge 'das Schwein' in den Akkusativ", "das Schwein"));
            vocabs.add(new Vocab("Konjugiere 'lesen' in die 2. Person Plural", "ihr lest"));
            vocabs.add(new Vocab("Etwas, das in der Welt existiert ist ein", "Konkretum"));
            vocabs.add(new Vocab("Etwas, das in der Vorstellung existiert ist ein", "Abstraktum"));
            vocabs.add(new Vocab("Tempusform von 'ich ging'", "Präteritum"));
            vocabs.add(new Vocab("Tempusform von 'ihr werdet gehen'", "Futur"));
            vocabs.add(new Vocab("Höchststufe von 'stark'", "am stärksten"));
            vocabs.add(new Vocab("Vergleichsstufe von 'stark'", "stärker"));
            vocabs.add(new Vocab("Grundstufe von 'stark'", "stark"));
            vocabs.add(new Vocab("Infinitiv von 'ich ging'", "gehen"));
            vocabs.add(new Vocab("'kommen': starkes oder schwaches Verb? (ich kam)", "starkes"));
            vocabs.add(new Vocab("'retten': starkes oder schwaches Verb? (ich rettete)", "schwaches"));
        }
        if (randomize) {
            Collections.shuffle(vocabs);
        }
        return vocabs;
    }
}
