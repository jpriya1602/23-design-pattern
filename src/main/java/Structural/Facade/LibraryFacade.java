package Structural.Facade;


public class LibraryFacade {

    private final Catalog catalog;
    private final LoanProcessor loanProcessor;
    private final  MembershipManager membershipManager;

    private final NotificationService notificationService;

    public LibraryFacade(Catalog catalog, LoanProcessor loanProcessor, MembershipManager membershipManager, NotificationService notificationService) {
        this.catalog = catalog;
        this.loanProcessor = loanProcessor;
        this.membershipManager = membershipManager;
        this.notificationService = notificationService;

        catalog.addBookToCatalog("Magic Book", "author", "ASDFG1234");
        membershipManager.registerMember("Priya", "6385799123");

    }

    public void borrowBook(int memberId, String bookTitle) throws Exception{

        if(!membershipManager.validateMemberShip(memberId))
            throw new Exception("Member: "+ memberId + " not valid");

        Member member = membershipManager.getMemberById(memberId);

        Book book = catalog.searchBookByTitle(bookTitle);

        if (!book.getAvailableStatus()){
            throw new Exception("Book: "+ bookTitle + " is not currently available" );
        }

        loanProcessor.borrowLoan(member, book);

        notificationService.sendLoanSuccessNotification(member, book);

        loanProcessor.printTransactions();

    }

    public static void main(String[] args) throws Exception {
        LibraryFacade libraryFacade = new LibraryFacade(new Catalog(), new LoanProcessor(), new MembershipManager(), new NotificationService());

        libraryFacade.borrowBook(1, "Magic Book");
    }
}
