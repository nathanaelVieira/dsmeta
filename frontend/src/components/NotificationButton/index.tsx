import axios from 'axios';
import icon from '../../assets/img/notification-icon.svg'; //Apelido icon from => (Voltando pasta anterion ../)
import { BASE_URL } from '../../utils/request';
import './style.css'; //Link com css na mesma pasta => ./

type Props = {
	saleId: number;

}


function handleClick(id: number) {
	axios(`${BASE_URL}/sales/${id}/notification`)
		.then(response => {
			console.log("Sucesso nathan!");
	})
}

function NotificationButton({saleId}: Props) {
  return (
	  <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
		  <img src={icon} alt="Notificar" />
	  </div>
  )
}

export default NotificationButton;
