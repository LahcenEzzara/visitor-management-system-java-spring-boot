$(document).ready(function() {
    $('.editButton').on('click', function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        console.log(href);
        if (href) {
        $.ajax({
            type: 'GET',
            url: href,
            dataType: 'json',  // Indiquez que vous attendez un objet JSON en réponse
            success: function(visitor) {
                $('#idEdit').val(visitor.id);
                $('#firstNameEdit').val(visitor.firstName);
                $('#lastNameEdit').val(visitor.lastName);
                $('#phoneNumberEdit').val(visitor.phoneNumber);
                $('#emailEdit').val(visitor.email);
                $('#reasonForVisitEdit').val(visitor.reasonForVisit);
                $('#arrivalDateTimeEdit').val(visitor.arrivalDateTime);
                $('#departureDateTimeEdit').val(visitor.departureDateTime);
                $('#editModal').modal();
            },
            error: function(xhr, status, error) {
                console.error(error);
                // Gérez l'erreur ici, par exemple, affichez un message à l'utilisateur
            }
        });
     } else {
            console.error('ID is null or undefined.');
            // Gérez le cas où l'ID est null ou undefined
        }
    });
});




