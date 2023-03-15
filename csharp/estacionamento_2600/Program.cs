using System;
using System.Collections.Generic;

List<int> queue = new List<int>();
string? line;

while ((line = Console.ReadLine()) != null)
{
    string[] inputs = line.Split(" ");

    int action = int.Parse(inputs[0]);
    int carId = int.Parse(inputs[1]);


    if (action == 1)
    {
        if (queue.Count() == 10)
        {
            Console.WriteLine("Nao ha vaga no estacionamento");
            continue;
        }
        queue.Add(carId);
        queue.ForEach(value => Console.WriteLine("Queue after add: " + value));
        Console.WriteLine("Carro estacionado");

    }

    if (action == 2)
    {
        int idPosition = queue.IndexOf(carId);

        if (idPosition < 0)
        {
            Console.WriteLine("Carro nao encontrado");
        }
        else
        {

            Console.WriteLine($"Carro liberado apos {idPosition} movimentos");
            queue.Remove(idPosition);

        }
    }

}
