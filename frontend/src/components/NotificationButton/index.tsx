import icon from '../../assets/img/notification-icon.svg' //Apelido icon from => (Voltando pasta anterion ../)
import './style.css' //Link com css na mesma pasta => ./


function NotificationButton() {
  return (
	  <div className="dsmeta-red-btn">
		  <img src={icon} alt="Notificar" />
	  </div>
  )
}

export default NotificationButton
