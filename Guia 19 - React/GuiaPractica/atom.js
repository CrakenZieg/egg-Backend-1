const data = [
    "6cbcb6248c3585121060b87e0e40f6f5.jpg",
    "8a30ccea0a212311260f19a0ef04f9e5.jpg",
    "387f83755fa2441189fcf1db22d1dd43.jpg",
    "8319d8575501aa3df3429823d8f3dd05.jpg",
    "1e425121d23e9ea6b4e002b0146dd6d3.jpg",
    "b325364850cceff2e521122c8a7bc394.jpg",
    "7ceb74b67ad26332ff61874d4c05fd9f.jpg",
    "8650717188888ff87d77d0f907fa1ec6.jpg",
    "6bfccd98aba1a6dfc8d7df5c043da020.jpg",
    "8319d8575501aa3df3429823d8f3dd05.jpg",
    "7ceb74b67ad26332ff61874d4c05fd9f.jpg",
    "b325364850cceff2e521122c8a7bc394.jpg",
    "6cbcb6248c3585121060b87e0e40f6f5.jpg",
    "8a30ccea0a212311260f19a0ef04f9e5.jpg",
    "387f83755fa2441189fcf1db22d1dd43.jpg",
    "8472b1149102745b29969ad29d3edfc1.jpg",
    "04ad3f7ad9220bb375b26f98f7b644f2.jpg",
    "d56d8a3edaeb3b22dbf468e907286cf4.jpg",
    "53c890ad7c81f7f998266378a60a8653.jpg",
    "7ed1a27da0a314ee6e4aad2c8fe4e5c4.jpg",
    "3dbe2cb8eed27d79bb701f6248fdf044.jpg",
    "29f3dbf7f4038ec510e0fa1c3888d7b8.jpg",
    "3adcadbd7f1394796c8e9f8a3cb00a0d.jpg",
    "7595ed5ffe4d2cd5f605e07f6602b2db.jpg",
    "eec1c4a64c6aeb052d45079a2ab50694.jpg",
    "c19946daa98502614de6088f941043cf.jpg",
    "1a7579da6f7cc68e8fcacb93943c707f.jpg",
    "c48a3334c73befbdab0e0f758fdf262a.jpg",
    "59c928b23e4b29944c6a3b7d5cc4d586.jpg",
    "601debde952b141db13aa5bc70640cfa.jpg",
    "5da0cf91bfaf0a76f5c880521a13e99e.jpg",
    "04ad3f7ad9220bb375b26f98f7b644f2.jpg",
    "8472b1149102745b29969ad29d3edfc1.jpg",
    "6cbcb6248c3585121060b87e0e40f6f5.jpg",
    "31c4208fe66c186da2f2455c01acc268.jpg",
    "4228050e354d7acf98393a3c0203f098.jpg",
    "e14aa3960cfd2c7c66c6388dd54659b6.jpg",
    "a8abbc93af44007ab21bbfd95182c078.jpg",
    "cd3cd7276ad9a27d7177eab5335aa54f.jpg",
    "3bbccccf6f525f613a90d1622939ba9d.jpg",
    "f1d56e1d901c79331cb8eb648604898d.jpg",
    "267f5a95f20ca3ffe1e4d69ca69f556a.jpg",
    "8ef6bc24831adef20468f05a3bb74b68.jpg",
    "a25b4f9029b8cff6e370ff02339ec0ce.jpg",
    "09fb4c5ba2ece04281d27c1a5b0ac20d.jpg",
    "d05968afbef50d35e166974af11be99c.jpg",
    "0974125ce11905232c4b1b24fcd991dd.jpg",
    "639ee0c15177a8a05f19dec99d3df85a.jpg",
    "25f893414a839b7ef543b7f42e094e11.jpg",
    "c2f1be2012df13809582cc46f9f21ba9.jpg",
    "7a509f1c08e4afc96d294c253f422dd1.jpg",
    "e89bcffcde341a3bf0bb0a8288de9295.jpg",
    "ae5196d9f71651b70b86c233f2434038.jpg",
    "d8fc50a81acf2304845bd61309a408d5.jpg",
    "91aef0e2aad07fefaea6e25cf0de413e.jpg",
    "0c8626468f1586279de2604ab6796fb3.jpg",
    "79c6609d0215353b95e5ba99a9838c4a.jpg",
    "35688a71cbc26db71cbbf08b86bf8b32.jpg",
    "d9bcec09aa3e8596607680b3ff7f2045.jpg",
    "6cf77b3a34d2cbbba0b43ee108d8a3f7.jpg",
    "989af7d1c6b3a334133274f7e96f06a3.jpg",
    "78b39f2531b30b7e1f447f1b800aa383.jpg",
    "14d238518ce2ed1c75359581d7b59758.jpg",
    "da9cd4d0464752ccf0674acab5bb66af.jpg",
    "a3941860faa7def08557fc4731789927.jpg",
    "a8a1eece85ab496e4bb799c020d38d94.jpg",
    "516b511dc4c2b8fb272a6217bc372d1d.jpg",
    "48ac4fc87c43172740df27e7b95b0439.jpg",
    "d76e4e9156be4c9ff2320817aa9cf821.jpg",
    "754467afaa9bc6dbcfa728bbb59b5da9.jpg",
    "07247d01d3f5e556b240c442ff0b405f.jpg",
    "c89dda9a869c2817583b214e71beb765.jpg",
    "f0000cae60e7e66561239eea43aea183.jpg",
    "32c840c6c42ebcf1a31fa3e12386c807.jpg",
    "3c1c15cf8299e25f7350f3e56be473bf.jpg",
    "7a561fd7665cbccf513263649759f1b4.jpg",
    "1884df7020925429525d38632b3e9296.jpg",
    "3fc5c4bca1afdddbcc54bb00db39b5c2.jpg",
    "7d726ad464f9daa28182e6a2ff6b4f08.jpg",
    "e16e4dd1e929113e4e5d7f82061e5ad7.jpg",
    "f1c8a45aee12e290458e94fde27d8d5a.jpg",
    "efc4d53c9bc6d7e3fdedce90424d0b23.jpg",
    "1f08aad081bfcbfdf0a702036e3e220d.jpg",
    "9623a61f9ab4fdc74754e4c30f0b3582.jpg",
    "d0385a7c054107f4f81110a9c7b4f99c.jpg",
    "c2e1c50afb300342cdf0e4664f87fe95.jpg",
    "98dbfdb4db8dc4cf5e7c7ab223859f13.jpg",
    "816604aa24ae2b781b3507ed2bda710d.jpg",
    "2964cadb0d91da1771b9ec69d132cd22.jpg",
    "1f08aad081bfcbfdf0a702036e3e220d.jpg",
    "9623a61f9ab4fdc74754e4c30f0b3582.jpg",
    "4ca1032efbb52dd9123de7441d16ff8f.jpg",
    "88e66c9353bef09cb83748f1a0523cde.jpg",
    "1c2dae5e4beca14da0e86fc8461270f0.jpg",
    "b937936afc5900c12221001cf8932171.jpg",
    "f0bd8047c2219312b5fc07dee5b6eb7f.jpg",
    "b6254ac46c850ab0aecfbf60905d55af.jpg",
    "b7cbdd296d9aaeee2c8b9ccbc9ddb51a.jpg",
    "162f508f094c75fed3a2a7a2b077fac3.jpg",
    "29d6d743d00638fe37e936c1f2a5d8df.jpg",
    "c4bfba35834f948dd57f56936108577e.jpg",
    "893747a3b1946c4f7f456c72c93f7da5.jpg",
    "c37e0c8116ed94f4f1ce099fe4805a28.jpg",
    "a7863a78d850825f4ac71e9bcb1845c1.jpg",
    "0444fd529bf57c74ac01d19a3a1601c3.jpg",
    "b15c7314f7462aba71f6988abd1a2160.jpg",
    "c0cdbe0bc7cf3435c33ddacd2d80e0ad.jpg",
    "0e9421396751236814d653d3cfcd773b.jpg",
    "bb62af17249cd9b70436b82186d29a1d.jpg",
    "43f0e9989cddde937f1bbe0337f4f1ce.jpg",
    "df327c1b901e8b990b3bdf4e8d58b6ba.jpg",
    "88e66c9353bef09cb83748f1a0523cde.jpg",
    "1c2dae5e4beca14da0e86fc8461270f0.jpg",
    "b937936afc5900c12221001cf8932171.jpg",
    "4ca1032efbb52dd9123de7441d16ff8f.jpg",
    "8c7b77455ba32f75dff121d69e7a73d8.jpg",
    "1576a5ba04aeeb0371880832fd2b181d.jpg",
    "705065143acc3d56ee6bc5957ec26b74.jpg",
    "d23ee3b5dbb32642926ab9313f44b309.jpg",
    "bea2ee34a70503bbde9d5fac7aaa4976.jpg",
    "5dbc1693d8868f100fa456ee6c741252.jpg",
    "d979d45a4588e472b252093302bad09e.jpg",
    "f4d8a98ac87213bc0f6ffb3552f6d740.jpg",
    "e97729a0d168170ec3772e94b1bfcdca.jpg",
    "40e7fa7088aee67222d4a0b96f8e0adc.jpg",
    "4fd01ae70606d49e4d9afc9af7331468.jpg",
    "0ae6d20ce33d7b030f60a7f5a126ccfa.jpg",
    "f7b1e0e07fe5641bbc12e33f64428eef.jpg",
    "fdf4f2a4fdcbdbff565c9301c20e2bd3.jpg",
    "e11e548f9e9b96cf064865f52e50fdbe.jpg",
    "222fe7151fa75a33059c217778f53e18.jpg",
    "e4764833b6c5200b12f6c2becfe0a359.jpg",
    "1ac1f4aadba27e7b8533b043bba44a2e.jpg",
    "a07ce346b18d64a61470028a318fd4a1.jpg",
    "e56e78270a8e547c1435060e8d0dbfbf.jpg",
    "80329aa084c911f4987c417c5c057575.jpg",
    "dad8e9e70b8ba4b4f36873ee1e94095c.jpg",
    "51dee7538ab059ddd2214de24c62c39a.jpg",
    "a052984c75890cf71a1fb55f2d5dc7fb.jpg",
    "ff6ff51cda1aca3d80eca4b5862bf972.jpg",
    "0a7bb75b5d9ca61f44528f0e0cb40d73.jpg",
    "353999ac02b116fd222b18d387ff36ff.jpg",
    "42cea1f2efb562ed6fcd99b2b2cc009d.jpg",
    "34273d06fc55588d1a636afe4b362b83.jpg",
    "317519279874a411a3108d801feadbfb.jpg",
    "250c1820ea4615715daa06824e05a7e0.jpg",
    "983e238584dc2df93546d7bcdbdeafe6.jpg",
    "4c4f6bfd2be9a3d6026195d76987c186.jpg",
    "9f1b471d2fd98bb3156f713478d5134e.jpg",
    "4220bf3aa7a17bd513a29018bf6a4594.jpg",
    "4c9b62885b79c3d7365aa7e4526280e2.jpg",
    "db02fc5f9465cade86c25b9f01e84896.jpg",
    "91f0daf52c71ae79cf590e81c600dfa0.jpg",
    "47cda490b140b307c1cfdfd5c3964efe.jpg",
    "6eb4e9561991f4f72af2f5ffe200181a.jpg",
    "dd2b1c46e14bb945665f0c8470661dd6.jpg",
    "6f4d5d81f61e49b684cc995baa559138.jpg",
    "b7316387a4209679ff742f72bebcefcb.jpg",
    "eeeab3863d4eea2d8555c54fdb317ea3.jpg",
    "3376052d1f1c6d0b22858466776668e2.jpg",
    "80e5be2d392cb31f1e9559f5031c74b6.jpg",
    "178b3501b546a2debf1f4e634c7af69d.jpg",
    "1cd4d8f120210cf1ef1454024c32a19e.jpg",
    "eaf941d0a03dd657d333a211d4927898.jpg",
    "2fe973587a14fbdb4bd5af58309ebbda.jpg",
    "12f3eeadc7f2fa68f2cbe89cfd17355d.jpg",
    "5ca16d6a77f0b43a94d8a0e9a4662b50.jpg",
    "4cb4e6e263b1a619d5dd26dfe4a034d9.jpg",
    "d2760917f99b3da19a5d9120cd2d8527.jpg",
    "ae2501a9a226b802e60cc65bffde246d.jpg",
    "54f998974bb1398c2ae91b3deb8e19af.jpg",
    "411053cebcb101c24b8df4f449fb40d6.jpg",
    "7a81c5560fb84253d767cadefe2839b5.jpg",
    "123da1f5bd929cf74db7a397f18eb914.jpg",
    "6f44fd451a97ef0f2a5a87af2eb73314.jpg",
    "4afd2655bb6bb0e449986922fb767551.jpg",
    "b3313614495e7d42cfe7ad9b2466ae3c.jpg",
    "e03a8b0ef91ad6224d9d2c35d40d8dff.jpg",
    "4758758351432b09b5c6a9d3e9e45324.jpg",
    "abd156bae018c6e60b55f21f908bd6fc.jpg",
    "94a7fd01d7279a76a091aafae365c0f5.jpg",
    "a171373ac95f769db6186dc95d789c23.jpg",
    "b952f76955365dd6ef231aceac5dd1fe.jpg",
    "fdc9288414bd71fc5966ba1521b3f5b8.jpg",
    "e4b074fa240deb1797fa27b9e653659d.jpg",
    "e94ed955868919dff0a1a5f2d92fd645.jpg",
    "847abdd35b66a3cdfa25b3169ab18b21.jpg",
    "a3918a7bd9ed6b0e92ec3acf92b5bfdc.jpg",
    "0b91dd253418996d760c96881ca23b72.jpg",
    "21065af20faa37086aebfe9d7bc2872b.jpg",
    "ce736ccf95cc6c6d5d92d9331ae115ee.jpg",
    "427393ebcaf31f09020fae42cf132c3d.jpg",
    "a442d5b83f3a2aecb0ea4deb2ecc84ed.jpg",
    "c1eb7259598fbd9f013e93e03a9d330f.jpg",
    "1f124d6c14dd1b784fe968b836655fbf.jpg",
    "f649847ad07c72406008e1907c6b6b63.jpg",
    "7fd7c134fa81b9d79cf334332190905e.jpg",
    "ac81ec2d8dc8c817308d119bb3467930.jpg",
    "7e78c038279277487edcb17fdef5eb0c.jpg",
    "b89690f07d3c72a186ca3aeadc356834.jpg",
    "b10e64a8ede789b823290628cac3133e.jpg",
    "5189cdb5b9819c0aaee225955a948179.jpg",
    "d582342153e59e3e5f17df343d26a730.jpg",
    "e77c0990fa49bad7cce70e79f728f882.jpg",
    "0d738553f8227262d84e52552cce4bf1.jpg",
    "4462942b910a22ff817b560650255072.jpg",
    "3b09b488d597ac2b5b869a3a2977f406.jpg",
    "4354a131a66bf17111c20fdfa04f6606.jpg",
    "35663e2c39a41e84cf2a4092fdb2ea31.jpg",
    "26382f12f726bee796e67009a8c3f40d.jpg",
    "52b29b9fd711cbc208e2a80ebfa9c2d8.jpg",
    "6a7f9059a09750767541537fc6059708.jpg",
    "5a58991db6d52ed9117c87389135ada6.jpg",
    "f465fc5268b0e06a3451723c7875e36c.jpg",
    "403eeebd6ce1e173d9302bd7774b0f86.jpg",
    "9092324f8ae90de3abeb514189615bc4.jpg",
    "57219e4592d98554170bc5c70498337c.jpg",
    "1353d0fd51d21f1a82a1e1831a8e508f.jpg",
    "afcbaef5f822e3c04fa2cb3b92d9e8b7.jpg",
    "ac13178b36033b9992cc43633a980fa5.jpg",
    "a5e3eb5cf22ffc017dff4177ce3b50d4.jpg",
    "c60916ed99128da657231ec126548007.jpg",
    "1a9e813a45f18ed90ac309ce84040f03.jpg",
    "d330671166081a6030ec75c6abb1e9ba.jpg",
    "4de394864ad9f2186e026110cd1508c6.jpg",
    "3aaea49eb70e13354f61862da07f66aa.jpg",
    "87cfb5e799959053b9b1737e4fe9c78f.jpg",
    "44b66cb14f72c2d5b63844f1ad0b55ab.jpg",
    "678a6eb23381cc343979465a2804fafd.jpg",
    "77a362629e399471f6bf85a6b5b0bb96.jpg",
    "57b99823d803f828f9546ebae9824929.jpg",
    "68680e49e1bfe2e39f392bcfb422a0b8.jpg",
    "3f5ceb276bdc26b5f2e9ea137a595c5d.jpg",
    "de466dfe07f06010fc227ca40090dbf3.jpg",
    "3e73d980b629185fa76d47fe69aaf93e.jpg",
    "15d5c0a956429ec173c997b92d062fe6.jpg",
    "c2412024bbd70088a79fe654568ab314.jpg",
    "858dd529e9ff5ec980b833eb7e8db23f.jpg",
    "7d429d67be46935e87eb457390c72a22.jpg",
    "94cca65c73bebe20164ed2a20f68610d.jpg",
    "364330bcd3e3cc6168876bf7dd0d3a4f.jpg",
    "e50ecef6ff69562d42a8df6e22bd4e35.jpg",
    "97065ad3be90bc13df56cc9780639040.jpg",
    "e5b87d7ad694857f7f11dd3d319bf1cf.jpg",
    "c9038b527822623f0c37c40d6de41fb0.jpg",
    "75bd7bd11b66e116ed4650ad82fc709d.jpg",
    "86d1be3a1dacbf82bd2f8f8604a13de5.jpg",
    "9e2e841b44f136ff7c47b671317e18d0.jpg",
    "cd407d77c497e5b99b7a4f5cee3d0f90.jpg",
    "79b0c5f61f907a07f0983365426fef9b.jpg",
    "6f02bf6b56c4de98c5293210ef83ac4a.jpg",
    "f48313e3cb53587d5b5bf251d4b692f1.jpg",
    "7b2a0546a34e70194741c1d6b0dd5b18.jpg",
    "22642a7c1d9201ff59acafc04f20dc31.jpg",
    "ddfab188735f1f4bd6efe06bb05100a9.jpg",
    "d6ecad30b6eb9c4ce307e271dab06947.jpg",
    "3a4d4eff3abb6019f0635279fee4f3fc.jpg",
    "855ad7453cfde62aefa9f138033afd04.jpg"
]

const url = 'https://online.anyflip.com/njqqe/alce/files/large/';

 function Dale() {   

    const imageUrls = data.map((e) => {return `${url+e}`});
    
    imageUrls.forEach(function (url, index) {
        downloadImage(url, "imagen_" + index + ".jpg");
    });

}

function downloadImage(url, filename) {        
    const link = document.createElement("a");
    link.setAttribute = ('preventDefault', true);
    //link.setAttribute('download', filename);
    link.innerHTML = filename+"<br>";
    link.href = url;
    link.type = "image/jpg";    
    link.download = filename;
    document.body.appendChild(link);
    link.click();
    //document.body.removeChild(link);
}

