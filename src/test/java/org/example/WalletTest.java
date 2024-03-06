package org.example;

import org.junit.jupiter.api.*;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WalletTest {

    private static Wallet wallet;

    @BeforeAll
    static void setUp() {
        System.out.println("Memulai test Wallet");
        wallet = new Wallet();
    }

    @BeforeEach
    void resetWallet() {
        System.out.println("Membersihkan Wallet untuk awal test");
        wallet.listKartu.clear();
        wallet.listUangLembaran.clear();

    }

    @Test
    void setOwner() {
        System.out.println("Test setOwner");
        wallet.setOwner("Fiki");
        assertEquals("Fiki", wallet.owner);
    }

    @Test
    void testtambahKartu() {
        System.out.println("Test tambahKartu");
        wallet.tambahKartu("Kartu Debit");
        wallet.tambahKartu("Kartu Kredit");

        assertEquals(2, wallet.listKartu.size());
        assertEquals("Kartu Debit", wallet.listKartu.get(0));
    }

    @Test
    void testambilKartu() {
        System.out.println("Test ambilKartu");
        wallet.tambahKartu("Kartu Debit");
        String KartuDiambil = wallet.ambilKartu("Kartu Debit");

        assertEquals("Kartu Debit", KartuDiambil);
        assertTrue(wallet.listKartu.isEmpty());
    }

    @Test
    void testtambahUangRupiah() {
        System.out.println("Test tambahUangRupiah");
        wallet.tambahUangRupiah(1500);

        assertEquals(1, Wallet.listUangLembaran.size());
        assertEquals(1500, Wallet.listUangLembaran.get(0));
    }

    @Test
    void testambilUang() {
        System.out.println("Test ambilUang");
        wallet.tambahUangRupiah(2000);
        wallet.tambahUangRupiah(200);
        int UangTaken = wallet.ambilUang(2000);

        assertEquals(2000, UangTaken, "Uang yang diambil adalah 2000");
    }

    @Test
    void tampilkanUang() {
        System.out.println("Test tampilkanUang");
        wallet.tambahUangRupiah(5000);
        wallet.tambahUangRupiah(200);
        int Uang = wallet.tampilkanUang();

        assertEquals(5200, Uang, "Uang yang ada di dompet adalah 5200");
    }

    @AfterEach
    void clearWalletState() {
        System.out.println("Membersihkan Wallet setelah test");
        wallet.listKartu.clear();
        wallet.listUangLembaran.clear();

    }

    @AfterAll
    static void tearDown() {
        System.out.println("Test Selesai");
    }
}
