%Resta
resta:- write('Ingrese primer numero='),
    read(1numero),
    write('Ingrese el segundo numero='),
    read(2numero),
    C is 1numero-2numero,
    format('El resultado es ~w',[C]).
