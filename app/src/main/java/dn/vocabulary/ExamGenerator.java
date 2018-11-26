package dn.vocabulary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamGenerator {

    private List<Vocab> vocabs = new ArrayList<>();

    public List<Vocab> getExam(String number, boolean randomize) {
        if ("Unit1b".equals(number)) {
//            vocabs.add(new Vocab("die Mitschülerin", "the classmate"));
//            vocabs.add(new Vocab("der Mitschüler", "the classmate"));
//            vocabs.add(new Vocab("der, die, das, die", "the"));
//            vocabs.add(new Vocab("kommen", "come"));
//            vocabs.add(new Vocab("Burg", "castle"));
//            vocabs.add(new Vocab("Meer", "sea"));
//            vocabs.add(new Vocab("Ist es Dienstag?", "Is it Tuesday?"));
//            vocabs.add(new Vocab("Donnerstag", "Thursday"));
//            vocabs.add(new Vocab("Samstag", "Saturday"));
//            vocabs.add(new Vocab("am Mittwoch", "on Wednesday"));
//            vocabs.add(new Vocab("Nein, das ist falsch", "No, that's wrong"));
//            vocabs.add(new Vocab("Sieh mal...", "Look"));
//            vocabs.add(new Vocab("hier, hierher", "here"));
//            vocabs.add(new Vocab("Es sind/es gibt", "There are"));
//            vocabs.add(new Vocab("viel.../viele", "many"));
//            vocabs.add(new Vocab("Fluss", "river"));
//            vocabs.add(new Vocab("Ozean", "ocean"));
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
        } else if ("Unit1cSentences".equals(number)) {
            vocabs.add(new Vocab("Wo ist Justin? (kurz)", "Where's Justin?"));
            vocabs.add(new Vocab("Es ist 11 Uhr. (kurz)", "It's 11 o'clock."));
            vocabs.add(new Vocab("Was ist die erste Frage?", "What is the first question?"));
            vocabs.add(new Vocab("Finde den Raum.", "Find the room."));
            vocabs.add(new Vocab("Gibt es Karten im Raum?", "Are there any maps in the room?"));
            vocabs.add(new Vocab("Gibt es eine Karte im Raum?", "Is there a map in the room?"));
            vocabs.add(new Vocab("Ja, es gibt eine Karte von England. (kurz)", "Yes, there's a map of England."));
            vocabs.add(new Vocab("Nein, es gibt keine Karte. (kurz)", "No, there isn't a map."));
            vocabs.add(new Vocab("Ja, es gibt viele Karten.", "Yes, there are lots of maps."));
            vocabs.add(new Vocab("Nein, es gibt keine Karten. (kurz)", "No, there aren't any maps."));
            vocabs.add(new Vocab("Ich kann es buchstabieren.", "I can spell it."));
            vocabs.add(new Vocab("Kannst du es buchstabieren?", "Can you spell it?"));
            vocabs.add(new Vocab("Hier ist es!", "Here it is!"));
            vocabs.add(new Vocab("Es gibt viele Computer.", "There are lots of computers."));
            vocabs.add(new Vocab("Wo kannst du ein Buch lesen?", "Where can you read a book?"));
            vocabs.add(new Vocab("Du bist doof, Justin. (kurz)", "You're silly, Justin."));
            vocabs.add(new Vocab("Wann ist die Bibliothek geöffnet?", "When is the library open?"));
            vocabs.add(new Vocab("Welche Farbe haben die Stühle?", "What colour are the chairs?"));
            vocabs.add(new Vocab("Können wir jetzt zurückgehen?", "Can we go back now?"));
            vocabs.add(new Vocab("Können wir ihn finden?", "Can we find him?"));
            vocabs.add(new Vocab("Team 2 ist der Gewinner.", "Team 2 are the winners."));
            vocabs.add(new Vocab("Wo sind deine Hausaufgaben?", "Where is your homework?"));
            vocabs.add(new Vocab("Auf welcher Seite sind wir?", "What page are we on?"));
            vocabs.add(new Vocab("Entschuldigung, ich komme zu spät.", "Sorry, I am late."));
            vocabs.add(new Vocab("Kann ich das Fenster öffnen?", "Can I open the window?"));
            vocabs.add(new Vocab("Ich kann einen Bleistift sehen.", "I can see a pencil."));
            vocabs.add(new Vocab("Apostroph (')", "apostrophe"));
        } else if ("deutsch1".equals(number)) {
            vocabs.add(new Vocab("lat.: Nomen", "Substantiv"));
            vocabs.add(new Vocab("Was bezeichnen Nomen/Substantive?", "Lebewesen, Dinge und Vorstellungen"));
            vocabs.add(new Vocab("lat.: grammatisches Geschlecht", "Genus"));
            vocabs.add(new Vocab("männliches Genus", "Maskulinum"));
            vocabs.add(new Vocab("weibliches Genus", "Femininum"));
            vocabs.add(new Vocab("sächliches Genus", "Neutrum"));
            vocabs.add(new Vocab("lat.: Begleiter", "Artikel"));
            vocabs.add(new Vocab("anderes Wort für 'das Meer'", "die See"));
            vocabs.add(new Vocab("anderes Wort für 'das kleine Gewässer'", "der See"));
            vocabs.add(new Vocab("anderes Wort für 'das Lenkrad'", "das Steuer"));
            vocabs.add(new Vocab("anderes Wort für 'die Geldabgabe'", "die Steuer"));
            vocabs.add(new Vocab("lat.: Einzahl", "Singular"));
            vocabs.add(new Vocab("lat.: Mehrzahl", "Plural"));
            vocabs.add(new Vocab("lat.: grammatische Zahl (Plural oder Singular)", "Numerus"));
            vocabs.add(new Vocab("lat.: grammatischer Fall", "Kasus"));
            vocabs.add(new Vocab("Was kann man mit Nomen machen? (lat.)", "deklinieren"));
            vocabs.add(new Vocab("Was kann man mit Nomen machen? (dt.)", "beugen"));
            vocabs.add(new Vocab("lat.: Grundform bei Verben", "Infinitiv"));
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
            vocabs.add(new Vocab("Grundstufe, Vergleichsstufe und", "Höchststufe"));
        }
        if (randomize) {
            Collections.shuffle(vocabs);
        }
        return vocabs;
    }
}
