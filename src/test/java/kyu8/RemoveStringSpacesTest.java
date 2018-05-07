package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveStringSpacesTest {

    @Test
    public void test() {
        assertEquals("Thisisaunspacifiedsentence.", RemoveStringSpaces.noSpace("This is a unspacified sentence."));
        assertEquals("ASDSDFSDFSDSDFSDFSD.", RemoveStringSpaces.noSpace("ASD SDF SDF SD SDF SDFS D."));
        assertEquals("Simple,removethespacesfromthestring,thenreturntheresultantstring.", RemoveStringSpaces.noSpace("Simple, remove the spaces from the string, then return the resultant string."));
        assertEquals("Loremipsumdolorsitamet,consecteturadipiscingelit.Aeneanegetrisusluctus,sagittisesteget,pulvinartortor.Maecenasvolutpat,maurisetfinibusbibendum,magnaenimefficiturquam,sitametvolutpatvelitmieumagna.Vestibulumateuismodturpis,etfeugiatleo.Phasellusatliberofelis.Integervelscelerisquelacus.Quisqueposueremagnautduielementum,inpellentesqueestultricies.Namnonliberoutduipellentesquefeugiat.Praesentcursussedturpisegetauctor.Curabiturlaoreetornarevestibulum.Vestibulumvelaliquamarcu.Sedscelerisqueutdiamvitaefacilisis.Utsitametfaucibusjusto.Morbipellentesquesemperligulaveldignissim.Vestibulumacnullaneque.", RemoveStringSpaces.noSpace("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eget risus luctus, sagittis est eget, pulvinar tortor. Maecenas volutpat, mauris et finibus bibendum, magna enim efficitur quam, sit amet volutpat velit mi eu magna. Vestibulum at euismod turpis, et feugiat leo. Phasellus at libero felis. Integer vel scelerisque lacus. Quisque posuere magna ut dui elementum, in pellentesque est ultricies. Nam non libero ut dui pellentesque feugiat. Praesent cursus sed turpis eget auctor. Curabitur laoreet ornare vestibulum. Vestibulum vel aliquam arcu. Sed scelerisque ut diam vitae facilisis. Ut sit amet faucibus justo. Morbi pellentesque semper ligula vel dignissim. Vestibulum ac nulla neque."));
    }

}
