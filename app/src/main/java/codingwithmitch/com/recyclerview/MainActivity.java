package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> content = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.redd.it/b37atvjx6wl01.jpg");
        mNames.add("Beijing alternatively romanized as Peking[12] ,[11] is the capital of the People's Republic of China. It is the world's most populous capital city, with over 21 million residents within an administrative area of 16,410.5 km2.");
        content.add("Beijing (/ˌbeɪˈdʒɪŋ/ BAY-JING[10][11] Mandarin pronunciation: [pèi.tɕíŋ] (About this soundlisten)), alternatively romanized as Peking[12] (/ˌpeɪˈkɪŋ/ PEY-KING),[11] is the capital of the People's Republic of China. It is the world's most populous capital city, with over 21 million residents within an administrative area of 16,410.5 km2.[4] The city, located in North China, is governed as a municipality under the direct administration of the central government with 16 urban, suburban, and rural districts.[13] Beijing is mostly surrounded by Hebei Province with the exception of neighboring Tianjin to the southeast; together, the three divisions form the Jingjinji megalopolis and the national capital region of China.[14] Beijing is an important world capital and global power city, and one of the world's leading centers for culture, diplomacy and politics, business and economy, education, language, and science and technology. A megacity, Beijing is the second-largest Chinese city by urban population after Shanghai and is the nation's cultural, educational, and political center.[15] It is home to the headquarters of most of China's largest state-owned companies and houses the largest number of Fortune Global 500 companies in the world, as well as the world's four biggest financial institutions.[16][17] Beijing has also been described as the \"billionaire capital of the world\" after overtaking New York City.[18][19] It is also a major hub for the national highway, expressway, railway, and high-speed rail networks. The Beijing Capital International Airport has been the second busiest in the world by passenger traffic since 2010,[20] and, as of 2016, the city's subway network is the busiest and longest in the world. Beijing is classified as an Alpha+ (global first tier) city, making it one of the world's Top 10 major cities together with Hong Kong and Shanghai in China by the Globalization and World Cities Research Network.[21]");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Nidaros and Trondhjem, is a city and municipality in Trøndelag county, Norway. It has a population of 199,039 (27/02/2020),[8] and is the third most populous municipality in Norway, although the fourth largest urban area. Trondheim lies on the south shore of Trondheim Fjord at the mouth of the River Nidelva. ");
        content.add("Trondheim (UK: /ˈtrɒndhaɪm, ˈtrɒnhaɪm/, US: /ˈtrɒnheɪm/,[6][7] Urban East Norwegian: [ˈtrɔ̂n(h)æɪm]; Southern Sami: Tråante), historically Kaupangen, Nidaros and Trondhjem, is a city and municipality in Trøndelag county, Norway. It has a population of 199,039 (27/02/2020),[8] and is the third most populous municipality in Norway, although the fourth largest urban area. Trondheim lies on the south shore of Trondheim Fjord at the mouth of the River Nidelva. The city is dominated by the Norwegian University of Science and Technology (NTNU), the Foundation for Scientific and Industrial Research (SINTEF), St. Olavs University Hospital and other technology-oriented institutions.");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal (Portuguese: [puɾtuˈɣal]), officially the Portuguese Republic (Portuguese: República Portuguesa [ʁɛˈpuβlikɐ puɾtuˈɣezɐ]),[note 4] is a country located mostly on the Iberian Peninsula, in southwestern Europe. ");
        content.add("Portugal (Portuguese: [puɾtuˈɣal]), officially the Portuguese Republic (Portuguese: República Portuguesa [ʁɛˈpuβlikɐ puɾtuˈɣezɐ]),[note 4] is a country located mostly on the Iberian Peninsula, in southwestern Europe. It is the westernmost sovereign state of mainland Europe, being bordered to the west and south by the Atlantic Ocean and to the north and east by Spain. Its territory also includes the Atlantic archipelagos of the Azores and Madeira, both autonomous regions with their own regional governments. The official and national language is Portuguese.");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park’s 415 square miles encompass and protect spectacular mountain environments.");
        content.add("With majestic mountains, tundra wildflowers, abundant wildlife, Trail Ridge Road (the highest paved road in the US), and over 350 miles of trails, Rocky Mountain National Park is spectacular!  From flat easy hikes around a mountain lake to challenging multiday backpack trips and climbs, Rocky Mountain National Park offers trails for hikers of every level - let us help you plan your adventure!  Find the best ways to take in the majesty and serenity of the park.  It's YOUR Rocky - explore it!");

        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual is a village on the Costa Maya in the municipality of Othon P. Blanco on the Caribbean Sea coast of the state of Quintana Roo,");
        content.add("Mahahual is a village on the Costa Maya in the municipality of Othon P. Blanco on the Caribbean Sea coast of the state of Quintana Roo, Mexico. Previously a fishing village, it is now a rapidly developing tourist center.\n" +
                "\n" +
                "The name of Mahahual possibly could come from the word \"mahahua\", it is a medium-sized tree, native to tropical America.[1]\n" +
                "\n" +
                "The village of Mahahual is only about 3 kilometers (1.9 mi) away from the Costa Maya cruise port, and cruise ships can easily be seen from the village. Mahahual has soft sand beaches, grass-thatched palapas, and the Mesoamerican Barrier Reef that runs along the coast. Many hotels, bars, restaurants, and shops can be found in this quaint tourist town.");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Spray Lakes Reservoir is a reservoir in Alberta, Canada. The Spray Lakes were a string of lakes formed along the Spray River, a tributary of the Bow River. With the damming of the river, the lakes were united in the Spray Lakes Reservoir.");
        content.add("Spray Lakes Reservoir is a reservoir in Alberta, Canada. The Spray Lakes were a string of lakes formed along the Spray River, a tributary of the Bow River. With the damming of the river, the lakes were united in the Spray Lakes Reservoir.\n" +
                "\n" +
                "It lies between the Goat Range and the Three Sisters ridge, at an elevation of 1,720 meters (5,640 ft). The lake is followed by Highway 742 (Smith Dorrien Trail) in the northern part.");

        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands National Park is an American national park located in the state of New Mexico on U.S. Route 70 approximately 15 miles (24 km) southwest of Alamogordo and 52 miles (84 km) northeast of Las Cruces, in western Otero County and northeastern Doña Ana County.");
        content.add("White Sands National Park is an American national park located in the state of New Mexico on U.S. Route 70 approximately 15 miles (24 km) southwest of Alamogordo and 52 miles (84 km) northeast of Las Cruces, in western Otero County and northeastern Doña Ana County. The park is situated at an average elevation of about 4,000 feet (1,219 m) in the Tularosa Basin and comprises the southern part of a 275 sq mi (710 km2) field of white sand dunes composed of gypsum crystals. The gypsum dunefield is the largest of its kind on Earth.");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Australia, officially known as the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.");
        content.add("Australia, officially known as the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.[12] It is the largest country in Oceania and the world's sixth-largest country by total area. The population of 26 million[6] (53 place in the world) is highly urbanised and heavily concentrated on the eastern seaboard.[13] Australia's capital is Canberra, and its largest city is Sydney. The country's other major metropolitan areas are Melbourne, Brisbane, Perth, and Adelaide.");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington, officially the State of Washington, is a state in the Pacific Northwest region of the United States");
        content.add("Washington (/ˈwɒʃɪŋtən/ (About this soundlisten)), officially the State of Washington, is a state in the Pacific Northwest region of the United States. Named for George Washington, the first U.S. president, the state was made out of the western part of the Washington Territory, which was ceded by the British Empire in 1846, in accordance with the Oregon Treaty in the settlement of the Oregon boundary dispute. The state, which is bordered on the west by the Pacific Ocean, Oregon to the south, Idaho to the east, and the Canadian province of British Columbia to the north, was admitted to the Union as the 42nd state in 1889. Olympia is the state capital; the state's largest city is Seattle. Washington is often referred to as Washington state to distinguish it from the nation's capital, Washington, D.C.");
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, content, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















