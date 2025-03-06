using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class AsianSedan : ISedan
    {
        public string GetEngine() => "1.8L Petrol";
        public string GetSeat() => "Fabric Seats";
        public string GetSize() => "Compact";
    }
}
