package com.historygo.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbExecutor implements CommandLineRunner {

    private UserRepository userRepository;


    public DbExecutor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {



       Place zamek = new Place(
                "Zamek Cesarski",
                "Zamek Cesarski w Poznaniu (niem. Königliches Residenzschloß) – najważniejsza budowla Dzielnicy Cesarskiej, powstała dla ostatniego cesarza niemieckiego i króla Prus Wilhelma II. Zamek został zaprojektowany przez Franza Schwechtena, jednak wiele elementów wprowadzono na życzenie Wilhelma II. Cesarz osobiście ustalił szczegółowy plan swojej nowej rezydencji.\";\n",
                15
        );

       Place ratusz =  new Place(
               "Ratusz",
               "Ratusz w Poznaniu – renesansowy budynek stojący na poznańskim Starym Rynku, pełniący niegdyś funkcję ratusza. Z wieży ratuszowej codziennie odgrywany jest hejnał Poznania.\n" ,
               20
       );

       Place malta = new Place(
               "Malta",
               "Malta Ski – ośrodek sportowo-rekreacyjny w Poznaniu, na południowym brzegu Jeziora Maltańskiego.",
               35
       );

       Place zoo = new Place(
               "Nowe Zoo",
               "Nowe Zoo w Poznaniu – drugi pod względem powierzchni ogród zoologiczny w Polsce, założony w 1974 roku na Białej Górze, wschodnim klinie zieleni Poznania. Zajmuje obszar 120,68 ha usytuowanych na pagórkowatym terenie leśnym z sześcioma rozległymi stawami o łącznej powierzchni ponad 13 ha stanowiąc naturalne siedlisko fauny krajowej. Nowe Zoo słynie z kolekcji ptaków drapieżnych oraz sów, która należy do jednej z najbogatszych w Europie.",
               30
       );

       Place politechnika = new Place(
               "Politechnika",
               "Politechnika Poznańska – państwowa uczelnia o profilu technicznym w Poznaniu. Największy kampus uczelni znajduje się po obu stronach ulicy Piotrowo, na terenie osiedla samorządowego Rataje. Siedziba władz uczelni (rektorat) mieści się w zabytkowym budynku na Wildzie. Za datę powstania tej uczelni przyjmuje się rok 1919, jakkolwiek status wyższej szkoły technicznej o charakterze politechniki nadała jej Rada Ministrów dopiero w 1955.",
               25
       );

        User u1 = new User(
                "Seul88",
                15,
                new ArrayList<>()
        );

        User u2 = new User(
                "Pavlo",
                15,
                Arrays.asList(
                       ratusz
                )
        );

        User u3 = new User(
                "Bolivar",
                15,
                Arrays.asList(
                        ratusz, politechnika, zoo, zamek, malta
                )
        );

        User u4 = new User(
                "Matiiii",
                15,
                Arrays.asList(
                         politechnika, zoo,  malta
                )
        );

        User u5 = new User(
                "Yankos",
                0,
                Arrays.asList(
                        politechnika, zoo, zamek
                )
        );

        User u6 = new User(
                "P0LA2007",
                0,
                Arrays.asList(
                        zoo, zamek, malta
                )
        );

        User u7 = new User(
                "RegnaR",
                100,
                Arrays.asList(
                         zamek
                )
        );

        User u8 = new User(
                "Vlad12",
                0,
                Arrays.asList(
                        zoo, malta
                )
        );

        User u9 = new User(
                "Yaglack",
                0,
                Arrays.asList(
                        ratusz, politechnika, zoo, malta
                )
        );

        User u10 = new User(
                "Martin9",
                0,
                Arrays.asList(
                        ratusz, politechnika, zoo, zamek, malta
                )
        );


        /*
        this.userRepository.deleteAll();;

        List<User> users = Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10);

        this.userRepository.save(users);
        */
    }
}
